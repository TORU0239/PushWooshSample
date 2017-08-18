package toru.io.my.pushwooshsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pushwoosh.Pushwoosh;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Pushwoosh.getInstance().registerForPushNotifications();
    }
}