package toru.io.my.pushwooshsample.deeplink;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import toru.io.my.pushwooshsample.R;

public class DeepLinkActivity extends AppCompatActivity {
    private static final String TAG = DeepLinkActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deep_link);
        setTitle("DeepLinkActivity!");

        if(getIntent() != null){
           String action = getIntent().getAction();
           Uri data = getIntent().getData();

           if(action.equals(Intent.ACTION_VIEW)){
               Log.w(TAG, "onCreate");
               processForDeepLink(data);
           }
           else{
               Log.w(TAG,"not action view ");
           }
        }
    }

    private void processForDeepLink(Uri data){
        Log.w(TAG, "processForDeepLink:: =============================================");
        Log.w(TAG, "processForDeepLink:: path: " + data.getPath());
        Log.w(TAG, "processForDeepLink:: scheme: " + data.getScheme());
        Log.w(TAG, "processForDeepLink:: host: " + data.getHost());
        Log.w(TAG, "processForDeepLink:: =============================================");
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.w(TAG, "onNewIntent");
        String action = intent.getAction();
        Uri data = intent.getData();
        processForDeepLink(data);
    }
}
