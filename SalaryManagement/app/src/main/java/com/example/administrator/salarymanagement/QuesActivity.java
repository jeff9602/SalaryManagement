package com.example.administrator.salarymanagement;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.administrator.question.Ques1Activity;
import com.example.administrator.question.Ques2Activity;
import com.example.administrator.question.Ques3Activity;
import com.example.administrator.question.Ques4Activity;

public class QuesActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ques);

        //开始做点击pic1
        //指向这个layout
        View tv1 = findViewById(R.id.pic1);
        //onclick
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(QuesActivity.this, Ques1Activity.class);
                ////启动
                startActivity(i);
            }

        });
        //开始做点击pic2
        //指向这个layout
        View tv2 = findViewById(R.id.pic2);
        //onclick
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(QuesActivity.this, Ques2Activity.class);
                ////启动
                startActivity(i);
            }

        });
        //开始做点击pic3
        //指向这个layout
        View tv3 = findViewById(R.id.pic3);
        //onclick
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(QuesActivity.this, Ques3Activity.class);
                ////启动
                startActivity(i);
            }

        });
        //开始做点击pic4
        //指向这个layout
        View tv4 = findViewById(R.id.pic4);
        //onclick
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                Intent i = new Intent(QuesActivity.this, Ques4Activity.class);
                ////启动
                startActivity(i);
            }

        });


    }


}
