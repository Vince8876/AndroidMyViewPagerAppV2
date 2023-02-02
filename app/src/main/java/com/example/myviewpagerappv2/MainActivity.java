package com.example.myviewpagerappv2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.configureViewPagerAndTabs();
    }

    private void configureViewPagerAndTabs()
    {
        ViewPager pager = findViewById(R.id.activity_main_viewpager);
        pager.setAdapter(new MyPageAdapter(getSupportFragmentManager()));

        TabLayout tabs = findViewById(R.id.activity_main_tabs);
        // Glue TabLayout and ViewPager together
        tabs.setupWithViewPager(pager);
        // Design : Tabs have the same width
        tabs.setTabMode(TabLayout.MODE_FIXED);
    }
}