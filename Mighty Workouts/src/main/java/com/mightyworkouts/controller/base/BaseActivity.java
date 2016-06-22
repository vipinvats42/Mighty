package com.mightyworkouts.controller.base;

import android.os.Build;
import android.support.v7.app.AppCompatActivity;

abstract public class BaseActivity extends AppCompatActivity {


    protected void hideActionBar()
    {
        if (Build.VERSION.SDK_INT >= 21) {
            this.getActionBar().hide();
        }

    }

    /**
     * This method is used to access the widgets references.
     *  Finds a view that was identified by the id attribute from the XML.
     */
    protected abstract void setWidgetsReferences();


    /**
     * This Method is used to set Listener on Widgets.
     *  Register a callback to be invoked when this view is clicked.
     */
    protected abstract void setListenerOnWidgets();


    /**
     * This method is used to set the custom font style on views
     */
    protected abstract void setFontStyle();


}
