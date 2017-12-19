package com.uniquedu.mytablayout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private android.widget.Button buttonfirst;
    private android.widget.Button buttonsec;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonsec = (Button) findViewById(R.id.button_sec);
        this.buttonfirst = (Button) findViewById(R.id.button_first);
        buttonsec.setOnClickListener(this);
        buttonfirst.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_first: {
                //显示一个简单的Tablyout不展示更多的内容
                Intent intent = new Intent(getApplicationContext(), FirstTabActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.button_sec: {
                //启动一个viewpager和tablayout联动的界面
                Intent intent = new Intent(getApplicationContext(), SecActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
