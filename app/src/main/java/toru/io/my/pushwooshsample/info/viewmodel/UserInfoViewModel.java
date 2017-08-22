package toru.io.my.pushwooshsample.info.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.ObservableField;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;

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

    public void afterUserGenderTextChanged(Editable editable) {
        info.setUserGender(editable.toString());
        Log.w(TAG, "user Gender:: " + info.getUserGender());
    }

    public void afterUserAgeTextChanged(Editable editable) {
        info.setUserAge(editable.toString());
        Log.w(TAG, "user Age:: " + info.getUserAge());
    }

    public void onButtonClick(View view) {
        Log.w(TAG, "onclicked!!!");
    }
}