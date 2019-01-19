package com.example.administrator.salarymanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TwoActivity extends Activity {
	@Override
	//被创建时
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		// 1.找到按钮控件,两个按钮
		Button button = (Button) findViewById(R.id.b1);
		Button button2 = (Button) findViewById(R.id.b2);
		Button button3 = (Button) findViewById(R.id.b3);
		Button button4 = (Button) findViewById(R.id.b4);
		// 3.设置按钮点击事件
		button.setOnClickListener(onClickListener);
		button2.setOnClickListener(onClickListener);
		button3.setOnClickListener(onClickListener);
		button4.setOnClickListener(onClickListener);
	}
	// 2.得到 OnClickListener 对象
	View.OnClickListener onClickListener = new View.OnClickListener() {

		@Override
		public void onClick(View v) {
			// 可以使用 switch 通过匹配控件id 设置不同的按钮提示不同内容
			// view.getId() 得到点击的控件的id
			switch (v.getId()) {
				case R.id.b1:
					Intent i = new Intent(TwoActivity.this, BfirstActivity.class);
					////启动
					startActivity(i);
					break;
				case R.id.b2:
					Intent i2 = new Intent(TwoActivity.this, BsecondActivity.class);
					////启动
					startActivity(i2);
					break;
				case R.id.b3:
					Intent i3 = new Intent(TwoActivity.this, WulianwangActivity.class);
					////启动
					startActivity(i3);
					break;
				case R.id.b4:
					Intent i4 = new Intent(TwoActivity.this, JisuanActivity.class);
					////启动
					startActivity(i4);
					break;
				default:
					break;
			}
		}
	};
	
}