package com.example.navdrawerapp.ui.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.navdrawerapp.ui.viewmodel.bean.User;

/**
 * @author Chris
 * @version 1.0
 * @since 2022-12-30
 */
public class UserViewModel extends ViewModel {
    public final MutableLiveData<User> mUserLiveData;

    public UserViewModel() {
        mUserLiveData = new MutableLiveData<>();
        // 模拟从网络加载用户信息
        mUserLiveData.postValue(new User(1, "name1"));
    }

    // 模拟 进行一些数据骚操作
    public void doSomething() {
        User user = mUserLiveData.getValue();
        if (user != null) {
            user.age = 15;
            user.name = "name15";
            mUserLiveData.setValue(user);
        }
    }

}
