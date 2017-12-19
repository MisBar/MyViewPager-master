package com.uniquedu.mytablayout;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class FirstTabActivity extends AppCompatActivity {
    private android.support.design.widget.TabLayout tablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_tab);
        this.tablayout = (TabLayout) findViewById(R.id.tablayout);
        //添加内容
        tablayout.addTab(tablayout.newTab().setText("标题一"));
        tablayout.addTab(tablayout.newTab().setText("标题二"));
        tablayout.addTab(tablayout.newTab().setText("标题三"));
        tablayout.addTab(tablayout.newTab().setText("标题四"));
        tablayout.addTab(tablayout.newTab().setText("标题五"));
        tablayout.addTab(tablayout.newTab().setText("标题六"));
        tablayout.addTab(tablayout.newTab().setText("标题七"));
        tablayout.addTab(tablayout.newTab().setText("标题八"));
        tablayout.addTab(tablayout.newTab().setText("标题九"));
    }
}
