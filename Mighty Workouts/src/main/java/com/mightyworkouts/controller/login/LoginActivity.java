package com.mightyworkouts.controller.login;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.mightyworkouts.R;
import com.mightyworkouts.controller.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    private EditText et_email;
    private EditText et_password;
    private TextView tv_remember_me;
    private ImageView iv_check_remeber;
    private TextView tv_forgot_password;

    private TextView tv_login;
    private TextView tv_signup;
    private TextView tv_sign_up;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        setStausBar();
    }

    @Override
    protected void setListenerOnWidgets() {

    }

    @Override
    protected void setWidgetsReferences() {

    }

    @Override
    protected void setFontStyle() {

    }

    private void setStausBar()
    {
        if (Build.VERSION.SDK_INT >= 21) {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        }

        hideActionBar();
    }
}
