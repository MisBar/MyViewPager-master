package com.uniquedu.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhongHang on 2016/4/13.
 */
public class StaggeredActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private MyImageAdapter myAdapter;
    private int[] imgs = {R.mipmap.stag1, R.mipmap.stag2, R.mipmap.stag3, R.mipmap.stag4,
            R.mipmap.stag5, R.mipmap.stag6, R.mipmap.stag7, R.mipmap.stag8, R.mipmap.stag9, R.mipmap.stag10, R.mipmap.stag11};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_staggered);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        myAdapter = new MyImageAdapter(imgs);
        StaggeredGridLayoutManager layoutManager =
                new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);//创建RecyclerView的排版方式这里使用的是线性排版
        mRecyclerView.setLayoutManager(layoutManager);//在设置adapter之前设置排版方式
        mRecyclerView.setAdapter(myAdapter);
    }
}
