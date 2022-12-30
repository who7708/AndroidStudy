package com.example.navdrawerapp.ui.viewmodel;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.navdrawerapp.databinding.FragmentMyUserBinding;
import com.example.navdrawerapp.ui.viewmodel.bean.User;

/**
 * @author Chris
 * @version 1.0
 * @since 2022-12-30
 */
public class MyUserFragment extends Fragment {

    private static final String TAG = MyUserFragment.class.getSimpleName();

    private FragmentMyUserBinding binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        binding = FragmentMyUserBinding.inflate(getLayoutInflater(), container, false);
        // return inflater.inflate(R.layout.fragment_my_user, container, false);
        return binding.getRoot();
    }

    @Override
    public void onStart() {
        super.onStart();
        // 这里拿到的ViewModel实例,其实是和Activity中创建的是一个实例
        // 1. activity 跳转 fragment
        // 2. 使用getActivity()
        UserViewModel userViewModel = new ViewModelProvider(getActivity()).get(UserViewModel.class);
        Log.d(TAG, "onStart: " + userViewModel);
        User user = userViewModel.mUserLiveData.getValue();
        binding.frTvShow.setText(user + "");
    }
}
