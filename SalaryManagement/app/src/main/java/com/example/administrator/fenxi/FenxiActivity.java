package com.example.administrator.fenxi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.salarymanagement.R;
import com.example.administrator.salarymanagement.TwoActivity;

public class FenxiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fenxi);
        //指向这个layout
        View tv = findViewById(R.id.fenxi1);
        //onclick
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(FenxiActivity.this, Fenxi1Activity.class);
                ////启动
                startActivity(i);
            }

        });
        //指向这个layout
        View tv2 = findViewById(R.id.fenxi2);
        //onclick
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(FenxiActivity.this, Fenxi2Activity.class);
                ////启动
                startActivity(i);
            }

        });
        //指向这个layout
        View tv3 = findViewById(R.id.fenxi3);
        //onclick
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(FenxiActivity.this, Fenxi3Activity.class);
                ////启动
                startActivity(i);
            }

        });
    }

}
