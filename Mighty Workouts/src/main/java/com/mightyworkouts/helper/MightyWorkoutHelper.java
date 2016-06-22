package com.mightyworkouts.helper;

import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Toast;

import com.mightyworkouts.utils.CommonUtils;

/**
 * Created by root on 10/12/15.
 */
public class MightyWorkoutHelper {


    public static void getDeviceLayoutConfiguration(Context context)
    {
        int screenSize = context.getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK;

        switch(screenSize) {
            case Configuration.SCREENLAYOUT_SIZE_LARGE:
                Toast.makeText(context, "Large screen", Toast.LENGTH_LONG).show();
                break;
            case Configuration.SCREENLAYOUT_SIZE_NORMAL:
                Toast.makeText(context, "Normal screen",Toast.LENGTH_LONG).show();
                break;
            case Configuration.SCREENLAYOUT_SIZE_SMALL:
                Toast.makeText(context, "Small screen",Toast.LENGTH_LONG).show();
                break;
            default:
                Toast.makeText(context, "Screen size is neither large, normal or small" , Toast.LENGTH_LONG).show();
        }
    }


    public static void getDeviceDensity(Context context)
    {
        int density= context.getResources().getDisplayMetrics().densityDpi;

        switch(density)
        {
            case DisplayMetrics.DENSITY_LOW:
                Toast.makeText(context, "LDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_MEDIUM:
                Toast.makeText(context, "MDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_HIGH:
                Toast.makeText(context, "HDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_XHIGH:
                Toast.makeText(context, "XHDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_XXHIGH:
                Toast.makeText(context, "XXHDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_XXXHIGH:
                Toast.makeText(context, "XXXHDPI", Toast.LENGTH_SHORT).show();
                break;
            case DisplayMetrics.DENSITY_TV:
                Toast.makeText(context, "TVDPI", Toast.LENGTH_SHORT).show();
                break;
            default:
                Toast.makeText(context, "Screen density : " + density , Toast.LENGTH_LONG).show();
        }
    }



    public static void printLog(int LOG_TYPE , String tag , String msg)
    {
        if(CommonUtils.LOG_ON)
        {
            switch (LOG_TYPE) {

                case CommonUtils.VERBOSE :
                    Log.v(tag, msg);
                    break;

                case CommonUtils.DEBUG :
                    Log.d(tag, msg);
                    break;

                case CommonUtils.INFO :
                    Log.i(tag, msg);
                    break;

                case CommonUtils.WARN :
                    Log.w(tag, msg);
                    break;

                case CommonUtils.ERROR :
                    Log.e(tag, msg);
                    break;

            }
        }

    }
}
