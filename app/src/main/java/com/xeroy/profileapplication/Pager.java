package com.xeroy.profileapplication;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Khalid on 2018-03-22.
 */

public class Pager extends FragmentStatePagerAdapter {

    int tabCount;

    public Pager(FragmentManager fm, int tabCount){
        super(fm);
        this.tabCount=tabCount;
    }


    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                Tab0Fragment tab0Fragment = new Tab0Fragment();
                return tab0Fragment;
            case 1:
                Tab1Fragment tab1Fragment = new Tab1Fragment();
                return tab1Fragment;
            case 2:
                Tab2Fragment tab2Fragment = new Tab2Fragment();
                return tab2Fragment;
            case 3:
                Tab3Fragment tab3Fragment = new Tab3Fragment();
                return tab3Fragment;
            case 4:
                Tab4Fragment tab4Fragment = new Tab4Fragment();
                return tab4Fragment;
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
