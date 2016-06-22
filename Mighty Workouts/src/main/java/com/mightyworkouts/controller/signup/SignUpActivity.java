package com.mightyworkouts.controller.signup;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.mightyworkouts.R;
import com.mightyworkouts.controller.base.BaseActivity;
import com.mightyworkouts.seekbar.DiscreteSeekBar;


public class SignUpActivity extends BaseActivity implements View.OnClickListener{

    DiscreteSeekBar strength_yellow_slider;
    DiscreteSeekBar fitness_orange_slider;
    DiscreteSeekBar flexiblity_green_slider;

    ImageView iv_yellow_point1;
    ImageView iv_yellow_point2;
    ImageView iv_yellow_point3;
    ImageView iv_yellow_point4;
    ImageView iv_yellow_point5;

    ImageView iv_orange_point1;
    ImageView iv_orange_point2;
    ImageView iv_orange_point3;
    ImageView iv_orange_point4;
    ImageView iv_orange_point5;


    ImageView iv_green_point1;
    ImageView iv_green_point2;
    ImageView iv_green_point3;
    ImageView iv_green_point4;
    ImageView iv_green_point5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        hideActionBar();

        this.setWidgetsReferences();
        this.setListenerOnWidgets();
        this.setSeekBarListener();

    }


    @Override
    protected void setWidgetsReferences() {

        strength_yellow_slider   = (DiscreteSeekBar) findViewById(R.id.strength_yellow_slider);
        fitness_orange_slider    = (DiscreteSeekBar) findViewById(R.id.fitness_orange_slider);
        flexiblity_green_slider  = (DiscreteSeekBar) findViewById(R.id.flexiblity_green_slider);

        iv_yellow_point1          = (ImageView)  findViewById(R.id.iv_yellow_point1);
        iv_yellow_point2          = (ImageView)  findViewById(R.id.iv_yellow_point2);
        iv_yellow_point3          = (ImageView)  findViewById(R.id.iv_yellow_point3);
        iv_yellow_point4          = (ImageView)  findViewById(R.id.iv_yellow_point4);
        iv_yellow_point5          = (ImageView)  findViewById(R.id.iv_yellow_point5);

        iv_orange_point1          = (ImageView)  findViewById(R.id.iv_orange_point1);
        iv_orange_point2          = (ImageView)  findViewById(R.id.iv_orange_point2);
        iv_orange_point3          = (ImageView)  findViewById(R.id.iv_orange_point3);
        iv_orange_point4          = (ImageView)  findViewById(R.id.iv_orange_point4);
        iv_orange_point5          = (ImageView)  findViewById(R.id.iv_orange_point5);

        iv_green_point1          = (ImageView)  findViewById(R.id.iv_green_point1);
        iv_green_point2          = (ImageView)  findViewById(R.id.iv_green_point2);
        iv_green_point3          = (ImageView)  findViewById(R.id.iv_green_point3);
        iv_green_point4          = (ImageView)  findViewById(R.id.iv_green_point4);
        iv_green_point5          = (ImageView)  findViewById(R.id.iv_green_point5);


    }

    @Override
    protected void setListenerOnWidgets() {


    }

    @Override
    protected void setFontStyle() {

    }


    private void setSeekBarListener() {

        strength_yellow_slider.setNumericTransformer(new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                setYellowSlider(value);
                return value;
            }
        });

        fitness_orange_slider.setNumericTransformer(new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                setOrangeSlider(value);
                return value;
            }
        });

        flexiblity_green_slider.setNumericTransformer(new DiscreteSeekBar.NumericTransformer() {
            @Override
            public int transform(int value) {
                setGreenSlider(value);
                return value;
            }
        });
    }




    @Override
    public void onClick(View v) {

        switch (v.getId())
        {


        }
    }



    public void setYellowSlider(int progress)
    {
        switch (progress)
        {
            case 0:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_yellow_point, iv_yellow_point1);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_yellow_point2, iv_yellow_point3, iv_yellow_point4, iv_yellow_point5);
                break;

            case 1:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_yellow_point, iv_yellow_point1 , iv_yellow_point2);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_yellow_point3, iv_yellow_point4, iv_yellow_point5);
                break;

            case 2:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_yellow_point, iv_yellow_point1 , iv_yellow_point2 , iv_yellow_point3);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_yellow_point4, iv_yellow_point5);
                break;

            case 3:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_yellow_point, iv_yellow_point1 , iv_yellow_point2 , iv_yellow_point3, iv_yellow_point4);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_yellow_point5);
                break;

            case 4:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_yellow_point, iv_yellow_point1, iv_yellow_point2, iv_yellow_point3, iv_yellow_point4, iv_yellow_point5);
                break;
        }
    }



    public void setOrangeSlider(int progress)
    {
        switch (progress)
        {
            case 0:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_ornage_point, iv_orange_point1);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_orange_point2, iv_orange_point3, iv_orange_point4, iv_orange_point5);
                break;

            case 1:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_ornage_point, iv_orange_point1 , iv_orange_point2);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_orange_point3, iv_orange_point4, iv_orange_point5);
                break;

            case 2:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_ornage_point, iv_orange_point1 , iv_orange_point2 , iv_orange_point3);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_orange_point4, iv_orange_point5);
                break;

            case 3:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_ornage_point, iv_orange_point1 , iv_orange_point2 , iv_orange_point3, iv_orange_point4);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_orange_point5);
                break;

            case 4:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_ornage_point, iv_orange_point1, iv_orange_point2, iv_orange_point3, iv_orange_point4, iv_orange_point5);
                break;
        }
    }



    public void setGreenSlider(int progress)
    {
        switch (progress)
        {
            case 0:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_green_point, iv_green_point1);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_green_point2, iv_green_point3, iv_green_point4, iv_green_point5);
                break;

            case 1:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_green_point, iv_green_point1 , iv_green_point2);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_green_point3, iv_green_point4, iv_green_point5);
                break;

            case 2:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_green_point, iv_green_point1 , iv_green_point2 , iv_green_point3);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_green_point4, iv_green_point5);
                break;

            case 3:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_green_point, iv_green_point1 , iv_green_point2 , iv_green_point3, iv_green_point4);
                SignUpHelper.setSliderIndicatorColor(R.drawable.gray_point, iv_green_point5);
                break;

            case 4:
                SignUpHelper.setSliderIndicatorColor(R.drawable.slider_green_point, iv_green_point1, iv_green_point2, iv_green_point3, iv_green_point4, iv_green_point5);
                break;
        }
    }


}
