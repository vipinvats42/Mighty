package com.mightyworkouts.controller.main;

import android.os.Bundle;
import android.widget.TextView;

import com.mightyworkouts.R;
import com.mightyworkouts.controller.base.BaseActivity;
import com.mightyworkouts.utils.Font;

public class SplashActivity extends BaseActivity {

    private TextView tv_progressTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        this.setWidgetsReferences();
        this.setFontStyle();
        this.setListenerOnWidgets();

    }


    @Override
    protected void setWidgetsReferences() {

        tv_progressTitle    = (TextView) findViewById(R.id.tv_progressTitle);

    }

    @Override
    protected void setListenerOnWidgets() {

    }

    @Override
    protected void setFontStyle() {

        tv_progressTitle.setTypeface(Font.getFont(this, getResources().getString(R.string.font_opensans_light)));
    }
}
