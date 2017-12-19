package com.uniquedu.myrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    @InjectView(R.id.button_horizontal)
    Button buttonHorizontal;
    @InjectView(R.id.button_vertical)
    Button buttonVertical;
    @InjectView(R.id.button_grid)
    Button buttonGrid;
    @InjectView(R.id.button_staggered)
    Button buttonStaggered;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

    }

    @OnClick({R.id.button_horizontal, R.id.button_vertical, R.id.button_grid, R.id.button_staggered})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_horizontal:
                startActivity(new Intent(getApplicationContext(),HorizontalActivity.class));
                break;
            case R.id.button_vertical:
                startActivity(new Intent(getApplicationContext(),VerticalActivity.class));
                break;
            case R.id.button_grid:
                startActivity(new Intent(getApplicationContext(),GridActivity.class));
                break;
            case R.id.button_staggered:
                startActivity(new Intent(getApplicationContext(),StaggeredActivity.class));
                break;
        }
    }
}
