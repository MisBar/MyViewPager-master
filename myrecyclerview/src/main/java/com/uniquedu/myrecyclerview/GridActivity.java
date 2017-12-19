package com.uniquedu.myrecyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZhongHang on 2016/4/13.
 */
public class GridActivity extends AppCompatActivity {
    private RecyclerView mRecyclerView;
    private List<Student> mStudents;
    private LayoutInflater mInflater;
    private MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);
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
        GridLayoutManager layoutManager = new GridLayoutManager(this, 2);
        mRecyclerView.setLayoutManager(layoutManager);//在设置adapter之前设置排版方式
        mRecyclerView.setAdapter(myAdapter);

    }
}
