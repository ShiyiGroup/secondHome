package com.shiyi.secondhome;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.Button;


import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


/**
 * Created by kiko on 2017/2/10.
 */
public class SignupActivity extends AppCompatActivity{
    private static final String TAG = "SignupActivity";
    @BindView(R.id.phoneWrapper)
    TextInputLayout phoneWrapper;
    @BindView(R.id.passwordWrapper)
    TextInputLayout passwordWrapper;
    @BindView(R.id.captchaWrapper)
    TextInputLayout captchaWrapper;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.captcha)
    Button captcha;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        ButterKnife.bind(this);
        passwordWrapper.setHint("密码");
        phoneWrapper.setHint("手机号");
        captchaWrapper.setHint("验证码");
        toolbar.setTitle("注册");
        setSupportActionBar(toolbar);

    }

    @OnClick(R.id.link_login)
    public void toLogin(){
        Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
        startActivity(intent);
    }
}
