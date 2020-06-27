package com.zubairmuddasir12fyp.work_at_home.ui.main;

import android.content.Context;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.zubairmuddasir12fyp.work_at_home.Fragments.categories_sub;
import com.zubairmuddasir12fyp.work_at_home.Fragments.guest_category;
import com.zubairmuddasir12fyp.work_at_home.Fragments.guest_interest;
import com.zubairmuddasir12fyp.work_at_home.Fragments.intersts_sub;
import com.zubairmuddasir12fyp.work_at_home.R;


public class SectionsPagerAdapter3 extends FragmentPagerAdapter {

    @StringRes
    private static final int[] TAB_TITLES = new int[]{R.string.tab_text_3, R.string.tab_text_4};
    private final Context mContext;

    public SectionsPagerAdapter3(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment = null;
        switch (position) {
            case 0:
                fragment = new guest_category();
                break;
            case 1:
                fragment = new guest_interest();
                break;
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return mContext.getResources().getString(TAB_TITLES[position]);
    }

    @Override
    public int getCount() {
        // Show 2 total pages.
        return 2;
    }
}