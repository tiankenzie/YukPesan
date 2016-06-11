package com.yukpesan.tian.yukpesan;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Gasik on 6/8/2016.
 */
public class Tabsadapter extends FragmentStatePagerAdapter {
    private int TOTAL_TABS = 2;

    public Tabsadapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new fragmenu();

            case 1:
                return new fragorder();
        }

        return null;
    }

    @Override
    public int getCount() {
        return TOTAL_TABS;
    }
}
