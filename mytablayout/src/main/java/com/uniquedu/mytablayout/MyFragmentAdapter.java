package com.uniquedu.mytablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.uniquedu.mytablayout.fragment.TitleFragment;

import java.util.List;

/**
 * Created by ZhongHang on 2016/4/8.
 * 这个Adapter覆写了getPageTitle的方法，他会自动的返回给TabLayout变成标题
 */
public class MyFragmentAdapter extends FragmentPagerAdapter {
    private List<TitleFragment> fragments;

    public MyFragmentAdapter(FragmentManager fm, List<TitleFragment> fragments) {
        super(fm);
        this.fragments = fragments;
    }

    public MyFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position).getFragment();
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments.get(position).getTitle();
    }
}
