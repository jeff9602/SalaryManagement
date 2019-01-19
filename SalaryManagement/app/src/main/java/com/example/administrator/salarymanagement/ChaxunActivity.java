package com.example.administrator.salarymanagement;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.LinearLayout;

public class ChaxunActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chaxun);
        //开始做点击
        //指向这个layout
        View tv = findViewById(R.id.see1);
        //onclick
        tv.setOnClickListener(new View.OnClickListener() {

            LinearLayout llayout = (LinearLayout)findViewById(R.id.hide1);
            @Override
            public void onClick(View view) {
                if(llayout.getVisibility()==View.VISIBLE){
                    llayout.setVisibility(View.GONE);
                }else{
                    llayout.setVisibility(View.VISIBLE);
                }
            }

        });

        //开始做点击2
        //指向这个layout
        View tv2 = findViewById(R.id.see2);
        //onclick
        tv2.setOnClickListener(new View.OnClickListener() {

            LinearLayout llayout = (LinearLayout)findViewById(R.id.hide2);
            @Override
            public void onClick(View view) {
                if(llayout.getVisibility()==View.VISIBLE){
                    llayout.setVisibility(View.GONE);
                }else{
                    llayout.setVisibility(View.VISIBLE);
                }
            }

        });
    }
}
