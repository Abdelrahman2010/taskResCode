package com.adwya.task.ui.auth.signup;

import androidx.appcompat.app.ActionBar;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import com.adwya.task.R;
import com.adwya.task.constans.ViewModelProviderFactory;
import com.adwya.task.databinding.ActivitySignUpBinding;
import com.adwya.task.ui.base.BaseActivity;

import javax.inject.Inject;

public class SignUpActivity extends BaseActivity<ActivitySignUpBinding, SignUpSignViewModel> implements SignUpNavigator {


    @Inject
    ViewModelProviderFactory factory;
    private SignUpSignViewModel signUpViewModel;
    private ActivitySignUpBinding mBinding;

    @Override
    public int getBindingVariable() {
        return com.adwya.task.BR.viewModel;
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_sign_up;
    }

    @Override
    public SignUpSignViewModel getViewModel() {
        signUpViewModel = ViewModelProviders.of(this, factory).get(SignUpSignViewModel.class);
        return signUpViewModel;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();



        signUpViewModel.signUpUser("ast@yahoo.com","12345678","A7med Husein","hsdjhsdjhdj","0113049");

    }

    @Override
    public void goToHome() {

        Toast.makeText(getApplicationContext(),"done",Toast.LENGTH_LONG).show();

    }

    @Override
    public void doHideKeyboard() {

    }

    @Override
    public void showAlertDialog(String message, String message_type) {

        Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();

      //  Toast.makeText(getApplicationContext(),message,Toast.LENGTH_LONG).show();

    }
}
