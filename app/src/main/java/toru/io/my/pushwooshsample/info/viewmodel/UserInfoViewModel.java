package toru.io.my.pushwooshsample.info.viewmodel;

import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioGroup;

import toru.io.my.pushwooshsample.R;
import toru.io.my.pushwooshsample.info.model.UserInfo;

/**
 * Created by toruchoi on 22/08/2017.
 */

public class UserInfoViewModel {

    private static final String TAG = UserInfoViewModel.class.getSimpleName();
    private UserInfo info;

    public UserInfoViewModel() {
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
                Log.w(TAG, "rb_female");
                break;

            case R.id.rb_male:
                Log.w(TAG, "rb_male");
                break;
        }
    }




    public void onButtonClick(View view) {
        Log.w(TAG, "onclicked!!!");
    }
}