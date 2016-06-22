package com.mightyworkouts.controller.searchresults;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;

import com.mightyworkouts.R;
import com.mightyworkouts.controller.base.BaseActivity;
import com.mightyworkouts.residemanager.ResideItem;
import com.mightyworkouts.residemanager.ResideMenu;
import com.mightyworkouts.residemanager.ResideMenuItem;

public class SearchResultsActivity extends BaseActivity implements  View.OnClickListener{

    private SearchResultsActivity mContext;
    private ResideMenu resideMenu;

    private ResideMenuItem itemMyWorkouts;
    private ResideMenuItem itemSearch;
    private ResideMenuItem itemSounds;
    private ResideMenuItem itemUpdateProfile;
    private ResideMenuItem itemMeasurements;
    private ResideMenuItem itemFAQ;
    private ResideMenuItem itemAbout;
    private ResideMenuItem itemLogout;

    private ImageView menu;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_results);

        mContext = this;
        hideActionBar();

        this.setWidgetsReferences();
        this.setListenerOnWidgets();
        this.setFontStyle();
        setUpMenu();
    }



    @Override
    protected void setWidgetsReferences() {

        menu = (ImageView) findViewById(R.id.menu);

    }

    @Override
    protected void setListenerOnWidgets() {

        menu.setOnClickListener(this);
    }

    @Override
    protected void setFontStyle() {

    }


    private void setUpMenu() {

        // attach to current activity;
        resideMenu = new ResideMenu(this);
        resideMenu.setUse3D(false);
        //resideMenu.setBackground(R.drawable.menu_background);
        resideMenu.attachToActivity(this);
        resideMenu.setMenuListener(menuListener);
        //valid scale factor is between 0.0f and 1.0f. leftmenu'width is 150dip.
        resideMenu.setScaleValue(0.6f);

        // create menu items;
        createMenuItems();
        setListenerOnMenu();
        addMenuItem();

        resideMenu.setSwipeDirectionDisable(ResideMenu.DIRECTION_RIGHT);


    }


    private void createMenuItems()
    {
        itemMyWorkouts          = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.MY_WORKOUTS);
        itemSearch              = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.SEARCH);
        itemSounds              = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.SOUNDS);
        itemUpdateProfile       = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.UPDATE_PROFILE);
        itemMeasurements        = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.MEASUREMENTS);
        itemFAQ                 = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.FAQ);
        itemAbout               = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.ABOUT);
        itemLogout              = new ResideMenuItem(this, R.drawable.ic_launcher, ResideItem.LOGOUT);
    }


    private void setListenerOnMenu()
    {
        itemMyWorkouts.setOnClickListener(this);
        itemSearch.setOnClickListener(this);
        itemSounds.setOnClickListener(this);
        itemUpdateProfile.setOnClickListener(this);
        itemMeasurements.setOnClickListener(this);
        itemFAQ.setOnClickListener(this);
        itemAbout.setOnClickListener(this);
        itemLogout.setOnClickListener(this);
    }



    private void addMenuItem(){

        resideMenu.addMenuItem(itemMyWorkouts, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemSearch, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemSounds, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemUpdateProfile, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemMeasurements, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemFAQ, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemAbout, ResideMenu.DIRECTION_LEFT);
        resideMenu.addMenuItem(itemLogout, ResideMenu.DIRECTION_LEFT);
    }



    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        return resideMenu.dispatchTouchEvent(ev);
    }

    @Override
    public void onClick(View view) {


        if (view == menu)
        {
            resideMenu.openMenu(ResideMenu.DIRECTION_LEFT);
        }


        /*if (view == itemHome){
            changeFragment(new HomeFragment());
        }else if (view == itemProfile){
            changeFragment(new ProfileFragment());
        }else if (view == itemCalendar){
            changeFragment(new CalendarFragment());
        }else if (view == itemSettings){
            changeFragment(new SettingsFragment());
        }*/

        //resideMenu.closeMenu();
    }

    private ResideMenu.OnMenuListener menuListener = new ResideMenu.OnMenuListener() {
        @Override
        public void openMenu() {

        }

        @Override
        public void closeMenu() {

        }
    };


    // What good method is to access resideMenu？
    public ResideMenu getResideMenu(){
        return resideMenu;
    }
}
