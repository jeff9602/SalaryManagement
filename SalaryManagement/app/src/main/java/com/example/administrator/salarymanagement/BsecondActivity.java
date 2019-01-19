package com.example.administrator.salarymanagement;

import android.app.Activity;
import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class BsecondActivity extends Activity {
	@Override
	//被创建时
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bsecond);
		String a = "b2.pdf";
		PDFView pdfView = (PDFView) findViewById(R.id.pdfView2);
		pdfView.fromAsset(a)
				.pages(0,1,2,3,4,5,6,7,8,9,10) // all pages are displayed by default
				.enableSwipe(true) // allows to block changing pages using swipe
				.swipeHorizontal(false)
				.enableDoubletap(true)
				.defaultPage(0)
				.load();

	}

	
}