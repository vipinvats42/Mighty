package com.mightyworkouts.controller.signup;

import android.widget.ImageView;

/**
 * Created by root on 15/12/15.
 */
public class SignUpHelper {


    public static void setSliderIndicatorColor(int drawable, ImageView... AGRS)
    {
        for (ImageView view : AGRS) {
             view.setBackgroundResource(drawable);
        }
    }





}
