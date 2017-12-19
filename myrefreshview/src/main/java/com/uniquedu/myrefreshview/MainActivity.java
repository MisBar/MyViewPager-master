package com.uniquedu.myrefreshview;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private android.widget.TextView textviewcontent;
    private android.support.v4.widget.SwipeRefreshLayout refresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.refresh = (SwipeRefreshLayout) findViewById(R.id.refresh);
        this.textviewcontent = (TextView) findViewById(R.id.textview_content);
        //此处设置下拉刷新控件的颜色
        refresh.setColorSchemeResources(
                R.color.swipe_color_1, R.color.swipe_color_2,
                R.color.swipe_color_3, R.color.swipe_color_4);
        //添加下拉事件上
        refresh.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                textviewcontent.setText("正在刷新。。。");
                //这里做个延时操作，在进程线程一章会讲到，这里先使用
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        refresh.setRefreshing(false);//停止刷新
                        textviewcontent.setText("刷新完成");
                    }
                }, 2000);
            }
        });
    }
}
