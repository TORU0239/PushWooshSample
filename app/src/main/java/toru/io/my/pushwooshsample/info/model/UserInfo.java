package toru.io.my.pushwooshsample.info.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import toru.io.my.pushwooshsample.BR;

/**
 * Created by toruchoi on 22/08/2017.
 */

public class UserInfo extends BaseObservable{
    private String userName;
    private boolean isGenderMale;
    private String userAge;

    public UserInfo() {}

    @Bindable
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
        notifyPropertyChanged(BR.userName);
    }

    @Bindable
    public boolean isGenderMale() {
        return isGenderMale;
    }

    public void setGenderMale(boolean genderMale) {
        isGenderMale = genderMale;
        notifyPropertyChanged(BR.genderMale);
    }

    @Bindable
    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge;
        notifyPropertyChanged(BR.userAge);
    }
}