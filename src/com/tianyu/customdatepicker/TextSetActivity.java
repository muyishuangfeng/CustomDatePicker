package com.tianyu.customdatepicker;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.view.Window;
import android.widget.TextView;

public class TextSetActivity extends Activity {
	/** 设置文本 */
	TextView mTxtSetting;
	protected boolean location;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.textset_activity);
		initView();
	}

	/**
	 * 初始化控件
	 */
	private void initView() {
		mTxtSetting = (TextView) findViewById(R.id.txt_setting);
		/*
		 * 第一种设置超链接的方法
		 */

		// 超链接
		if (location) {
			String text = "Visit <a href=\"http://baidu.com/\">BaiDu home page</a>";
			// 设置超链接
			mTxtSetting.setText(Html.fromHtml(text));
			// 设置连接
			mTxtSetting.setMovementMethod(LinkMovementMethod.getInstance());
		} else {

			/*
			 * 第二种设置超链接的方法
			 */
			Spannable mText = new SpannableString(mTxtSetting.getText());
			/*
			 * 第一个参数：目的
			 * 
			 * 第二个参数：开始位置
			 * 
			 * 第三个参数：结束位置
			 * 
			 * 第四个参数：标记
			 */
			mText.setSpan(new BackgroundColorSpan(Color.RED), 1, 4, 0);
			mText.setSpan(new ForegroundColorSpan(Color.BLUE), 5, 19, 0);
			mTxtSetting.setText(mText);
		}

	}
}
