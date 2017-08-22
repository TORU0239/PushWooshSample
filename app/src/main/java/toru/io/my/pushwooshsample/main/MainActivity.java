package toru.io.my.pushwooshsample.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import toru.io.my.pushwooshsample.R;
import toru.io.my.pushwooshsample.info.activity.UserInfoActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToUserInfo(View view){
        startActivity(new Intent(MainActivity.this, UserInfoActivity.class));
    }
}