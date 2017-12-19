package com.uniquedu.mytablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.uniquedu.mytablayout.fragment.FragmentFirst;
import com.uniquedu.mytablayout.fragment.FragmentSec;
import com.uniquedu.mytablayout.fragment.FragmentThird;
import com.uniquedu.mytablayout.fragment.TitleFragment;

import java.util.ArrayList;
import java.util.List;

public class SecActivity extends AppCompatActivity {
    private ViewPager viewpager;
    private List<TitleFragment> fragments;
    private TabLayout tablayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        this.tablayout = (TabLayout) findViewById(R.id.tablayout);
        this.viewpager = (ViewPager) findViewById(R.id.viewpager);
        fragments = new ArrayList<>();
        fragments.add(new TitleFragment(new FragmentFirst(), "第一个标题"));
        fragments.add(new TitleFragment(new FragmentSec(), "第二个标题"));
        fragments.add(new TitleFragment(new FragmentThird(), "第三个标题"));
        MyFragmentAdapter adapter = new MyFragmentAdapter(getSupportFragmentManager(), fragments);
        viewpager.setAdapter(adapter);
        tablayout.setupWithViewPager(viewpager);
        //这里没有给tablayout添加Tab，他会自动寻找viewpager的adapter中的getTitle方法，此方法
        //必须在setadapter之后此处设置就会将Tab的事件关联，不然还要添加Viewpager的事件，以及Tab的事件
        //以下是不使用setupwith是添加事件的方法，viewpager改动为addOnPageChangeListener，可以添加多个事件不覆盖，
        //setOnPageChangeListener是会覆盖掉事件
//        viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tablayout));
//        tablayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
    }
}
