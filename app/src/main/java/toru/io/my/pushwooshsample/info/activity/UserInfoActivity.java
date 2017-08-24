package toru.io.my.pushwooshsample.info.activity;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;

import toru.io.my.pushwooshsample.R;
import toru.io.my.pushwooshsample.databinding.ActivityUserInfoBinding;
import toru.io.my.pushwooshsample.info.viewmodel.UserInfoViewModel;

public class UserInfoActivity extends AppCompatActivity {

    private static final String TAG = UserInfoActivity.class.getSimpleName();

    private ActivityUserInfoBinding binding;

    private AlertDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_user_info);
        setTitle("PushWooshUserData");
        binding.setUserViewModel(new UserInfoViewModel(this));
    }

    public void showDialog(String msg){
        if(dialog == null){
            dialog = new AlertDialog.Builder(this)
                    .setTitle("Notice")
                    .setMessage(msg)
                    .create();
        }

        dialog.show();
    }

    public void dismissDialog(){
        if(dialog != null){
            dialog.dismiss();
        }
    }

}