package com.example.samsung.xiaoshixunqizhong.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by samsung on 2019/6/13.
 */

public class MyFragAdapter extends FragmentStatePagerAdapter{
    private ArrayList<Fragment>fragments;
    private ArrayList<String>list;

    public MyFragAdapter(FragmentManager fm, ArrayList<Fragment> fragments, ArrayList<String> list) {
        super(fm);
        this.fragments = fragments;
        this.list = list;
    }

    public MyFragAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return list.get(position);
    }
}
