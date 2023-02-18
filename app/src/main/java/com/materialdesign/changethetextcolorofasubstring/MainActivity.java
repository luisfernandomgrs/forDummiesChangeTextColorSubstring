package com.materialdesign.changethetextcolorofasubstring;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		TextView textView = findViewById(R.id.text_view);
		String text = "I want THIS and THIS to be colored";
		ForegroundColorSpan fcsRed = new ForegroundColorSpan(Color.RED);
		ForegroundColorSpan fcsGreen = new ForegroundColorSpan(Color.GREEN);
		SpannableString ss = new SpannableString(text);

		ss.setSpan(fcsRed, 7, 11, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
		ss.setSpan(fcsGreen, 16, 20, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

		textView.setText(ss);
	}
}