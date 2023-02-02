package com.example.myviewpagerappv2;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPageAdapter extends FragmentPagerAdapter {

    public MyPageAdapter(FragmentManager mgr)
    {
        super(mgr);
    }

    @Override
    public int getCount() {
        return 3; // Number of pages to show
    }

    @Override
    public Fragment getItem(int position) {
        switch (position)
        {
            case 0: return NewsPageFragment.newInstance();
            case 1: return ProfilePageFragment.newInstance();
            case 2: return ParamPageFragment.newInstance();
            default: return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position)
        {
            case 0: return "Fils d'actualité";
            case 1: return "Profil";
            case 2: return "Paramètres";
            default: return null;
        }
    }
}

