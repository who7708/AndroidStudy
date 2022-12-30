package com.example.navdrawerapp.ui.viewmodel;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawerapp.databinding.ActivityTestViewModelBinding;
import com.example.navdrawerapp.ui.viewmodel.bean.User;

public class TestViewModelActivity extends AppCompatActivity {

    private ActivityTestViewModelBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityTestViewModelBinding.inflate(getLayoutInflater());
        // setContentView(R.layout.activity_test_view_model);
        setContentView(binding.getRoot());

        //构建ViewModel实例
        final UserViewModel userViewModel = new ViewModelProvider(this).get(UserViewModel.class);
        // 让TextView观察ViewModel中数据的变化,并实时展示
        userViewModel.mUserLiveData.observe(this, new Observer<User>() {
            @Override
            public void onChanged(User user) {
                binding.tvContent.setText(user.toString());
            }
        });

        // 点击按钮  更新User数据  观察TextView变化
        binding.btnContent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userViewModel.doSomething();
            }
        });
    }
}