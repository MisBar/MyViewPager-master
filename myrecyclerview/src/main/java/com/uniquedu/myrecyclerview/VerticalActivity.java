package com.uniquedu.myrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

public class VerticalActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Student> mStudents;
    private LayoutInflater mInflater;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vertical);
        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerview);
        mStudents = new ArrayList<>();
        mStudents.add(new Student("张三", 20, "男", R.mipmap.male));
        mStudents.add(new Student("李四", 18, "女", R.mipmap.female));
        mStudents.add(new Student("王五", 20, "男", R.mipmap.male));
        mStudents.add(new Student("赵六", 20, "男", R.mipmap.male));
        mStudents.add(new Student("李四", 18, "女", R.mipmap.female));
        mStudents.add(new Student("王五", 20, "男", R.mipmap.male));
        mStudents.add(new Student("赵六", 20, "男", R.mipmap.male));
        mInflater = getLayoutInflater();
        myAdapter = new MyAdapter(mInflater, mStudents);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);//创建RecyclerView的排版方式这里使用的是线性排版
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);//设置排版的方向，这里是水平排版
        mRecyclerView.setLayoutManager(layoutManager);//在设置adapter之前设置排版方式
        mRecyclerView.setAdapter(myAdapter);

    }
}
