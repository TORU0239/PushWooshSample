package toru.io.my.pushwooshsample.info.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import toru.io.my.pushwooshsample.R;

public class UserInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_info);
    }

    public void registerUserInfo(View v){
        // using pushwoosh sdk, send user information to server
    }
}