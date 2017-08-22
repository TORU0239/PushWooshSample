package toru.io.my.pushwooshsample.info.viewmodel;

import android.content.Context;
import android.support.annotation.NonNull;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.pushwoosh.Pushwoosh;
import com.pushwoosh.PushwooshService;
import com.pushwoosh.exception.PushwooshException;
import com.pushwoosh.function.Callback;
import com.pushwoosh.function.Result;
import com.pushwoosh.internal.network.PushRequest;
import com.pushwoosh.tags.Tags;
import com.pushwoosh.tags.TagsBundle;

import toru.io.my.pushwooshsample.R;
import toru.io.my.pushwooshsample.info.model.UserInfo;

/**
 * Created by toruchoi on 22/08/2017.
 */

public class UserInfoViewModel {
    private static final String TAG = UserInfoViewModel.class.getSimpleName();
    private Context ctx;
    private UserInfo info;

    public UserInfoViewModel(Context ctx) {
        this.ctx = ctx;
        info = new UserInfo();
    }

    // edittext for user name
    public void afterTextChanged(Editable editable) {
        info.setUserName(editable.toString());
        Log.w(TAG, "user Name:: " + info.getUserName());
    }

    // edittext for user age
    public void afterUserAgeTextChanged(Editable editable) {
        info.setUserAge(editable.toString());
        Log.w(TAG, "user Age:: " + info.getUserAge());
    }

    // radiogroup for user gender
    public void onCheckedChanged(RadioGroup radioGroup, int id) {
        switch (id){
            case R.id.rb_female:
                info.setGenderMale(false);
                break;

            case R.id.rb_male:
                Log.w(TAG, "rb_male");
                info.setGenderMale(true);
                break;
        }
    }

    // button for sending user info
    public void onButtonClick(View view) {
        Log.w(TAG, "onclicked!!!");
        if(info.getUserAge() != null && info.getUserAge().length() > 0
                && info.getUserName() != null
                && info.getUserName().length() > 0){

            TagsBundle bundle = new TagsBundle.Builder()
                                .putBoolean("isMale", info.isGenderMale())
                                .putString("name", info.getUserName())
                                .putString("age", info.getUserAge())
                                .build();

            Pushwoosh.getInstance().sendTags(bundle, new Callback<Void, PushwooshException>() {
                @Override
                public void process(@NonNull Result<Void, PushwooshException> result) {
                    if(result.isSuccess()){
                        Log.w(TAG, "tag result success!");
                    }
                    else{
                        Log.w(TAG, "tag result failed!");
                    }
                }
            });
        }
        else{
            Toast.makeText(ctx, "no information!", Toast.LENGTH_SHORT).show();
        }
    }
}