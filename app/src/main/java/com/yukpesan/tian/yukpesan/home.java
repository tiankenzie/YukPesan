package com.yukpesan.tian.yukpesan;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.widget.TextView;


/**
 * Created by User on 6/11/2016.
 */
public class home extends ActionBarActivity implements android.support.v7.app.ActionBar.TabListener{
    private ViewPager tabsviewPager;
    private Tabsadapter mTabsAdapter;
    TextView title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setCustomView(R.layout.actionbar1);

        setContentView(R.layout.home);
        title = (TextView) findViewById(R.id.title);
        title.setText("Home");

        tabsviewPager = (ViewPager) findViewById(R.id.pages);
        mTabsAdapter = new Tabsadapter(getSupportFragmentManager());
        tabsviewPager.setAdapter(mTabsAdapter);

        getSupportActionBar().setHomeButtonEnabled(false);
        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);

        ActionBar.Tab tab_menu = getSupportActionBar().newTab().setText("Menu").setTabListener(this);
        ActionBar.Tab tab_order = getSupportActionBar().newTab().setText("Order").setTabListener(this);

        getSupportActionBar().addTab(tab_menu);
        getSupportActionBar().addTab(tab_order);

        tabsviewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                getSupportActionBar().setSelectedNavigationItem(position);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }


    @Override
    public void onTabSelected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {
       tabsviewPager.setCurrentItem(tab.getPosition());
    }

    @Override
    public void onTabUnselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }

    @Override
    public void onTabReselected(ActionBar.Tab tab, android.support.v4.app.FragmentTransaction ft) {

    }
}
