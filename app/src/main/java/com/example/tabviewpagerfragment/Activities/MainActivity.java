package com.example.tabviewpagerfragment.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.TableLayout;

import com.example.tabviewpagerfragment.Adapter.MyPagerAdapter;
import com.example.tabviewpagerfragment.R;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager2;

    public MyPagerAdapter myPagerAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.TablayId);
        viewPager2 = findViewById(R.id.pagerId);

        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager(),0);
        viewPager2.setAdapter(myPagerAdapter);

        tabLayout.setupWithViewPager(viewPager2);



    }
}