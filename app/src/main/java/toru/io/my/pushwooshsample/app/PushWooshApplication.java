package toru.io.my.pushwooshsample.app;

import android.app.Application;
import android.support.annotation.NonNull;
import android.util.Log;

import com.pushwoosh.Pushwoosh;
import com.pushwoosh.exception.RegisterForPushNotificationsException;
import com.pushwoosh.function.Callback;
import com.pushwoosh.function.Result;

/**
 * Created by toruchoi on 21/08/2017.
 */

public class PushWooshApplication extends Application {
    private static final String TAG = PushWooshApplication.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        initPushWoosh();
    }

    private void initPushWoosh(){
        Log.w(TAG, "initPushWoosh, application");
        Pushwoosh.getInstance().registerForPushNotifications(new Callback<String, RegisterForPushNotificationsException>() {
            @Override
            public void process(@NonNull Result<String, RegisterForPushNotificationsException> result) {
                if (result.isSuccess()) {
                    Log.d(TAG, "Successfully registered for push notifications with token: " + result.getData());
                } else {
                    Log.d(TAG, "Failed to register for push notifications: " + result.getException().getMessage());
                }
            }
        });
    }
}
