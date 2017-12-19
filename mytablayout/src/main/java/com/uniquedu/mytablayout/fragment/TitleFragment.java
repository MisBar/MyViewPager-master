package com.uniquedu.mytablayout.fragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by ZhongHang on 2016/4/11.
 * 只是给fragment添加标题,fragment不能使用带有参数的构造器
 */
public class TitleFragment {
    private Fragment fragment;
    private String title;

    public TitleFragment(Fragment fragment, String title) {
        this.fragment = fragment;
        this.title = title;
    }

    public TitleFragment() {
    }

    public Fragment getFragment() {
        return fragment;
    }

    public void setFragment(Fragment fragment) {
        this.fragment = fragment;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
