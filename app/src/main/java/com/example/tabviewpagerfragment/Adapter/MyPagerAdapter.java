package com.example.tabviewpagerfragment.Adapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.tabviewpagerfragment.Fragments.FirstFrag;
import com.example.tabviewpagerfragment.Fragments.FourthFrag;
import com.example.tabviewpagerfragment.Fragments.SecondFrag;
import com.example.tabviewpagerfragment.Fragments.ThirdFrag;

public class MyPagerAdapter extends FragmentStatePagerAdapter {

    String[] Text = {"Australia", "Bangladesh", "India", "Pakistan"};

    public MyPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new FirstFrag();
        } else if (position == 1) {
            return new SecondFrag();
        } else if (position == 2) {
            return new ThirdFrag();
        } else if (position == 3) {
            return new FourthFrag();
        }
        return new FirstFrag();
    }

    @Override
    public int getCount() {
        return Text.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {


        return Text[position];
    }
}
