package com.uniquedu.myscrollview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private android.widget.Button buttonvertical;
    private android.widget.Button buttonhorizontal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.buttonvertical = (Button) findViewById(R.id.button_scrollview);
        this.buttonhorizontal = (Button) findViewById(R.id.button_horizontal);
        buttonvertical.setOnClickListener(this);
        buttonhorizontal.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_scrollview: {
                Intent intent = new Intent(getApplicationContext(), VerticalActivity.class);
                startActivity(intent);
            }
            break;
            case R.id.button_horizontal: {
                Intent intent = new Intent(getApplicationContext(), HorizontalActivity.class);
                startActivity(intent);
            }
            break;
        }
    }
}
