package com.tianyu.customdatepicker;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements OnClickListener {
	/** 开始时间 */
	private Button mBtnStart;
	/** 结束时间 */
	private Button mBtnEnd;
	/** 设置文本按钮 */
	private Button mBtnSetting;
	/** 设置字体样式按钮 */
	private Button mBtnSetShaow;
	/** 初始化开始时间 */
	protected String mInitDateTimeStart = "2016年1月10号  19:31";
	/** 初始化结束时间 */
	protected String mInitDateTimeEnd = "2020年1月10号  19:31";
	/** DatePickerDialogUtil类 */
	private DatePickerDialogUtil mDatePickerDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		mBtnStart = (Button) findViewById(R.id.btn_start);
		mBtnStart.setText(mInitDateTimeStart);
		mBtnStart.setOnClickListener(this);

		mBtnEnd = (Button) findViewById(R.id.btn_end);
		mBtnEnd.setText(mInitDateTimeEnd);
		mBtnEnd.setOnClickListener(this);

		mBtnSetting = (Button) findViewById(R.id.btn_textSet);
		mBtnSetting.setOnClickListener(this);

		mBtnSetShaow = (Button) findViewById(R.id.btn_setShaow);
		mBtnSetShaow.setOnClickListener(this);

	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btn_start: {// 开始时间按钮
			mDatePickerDialog = new DatePickerDialogUtil(this,
					mInitDateTimeStart);
			mDatePickerDialog.datePickerDialog(mBtnStart);
			break;
		}

		case R.id.btn_end: {// 结束时间按钮
			mDatePickerDialog = new DatePickerDialogUtil(this, mInitDateTimeEnd);
			mDatePickerDialog.datePickerDialog(mBtnEnd);
			break;
		}
		case R.id.btn_textSet: {// 设置文本按钮
			Intent intent = new Intent(this, TextSetActivity.class);
			startActivity(intent);
			break;
		}
		case R.id.btn_setShaow: {// 设置字体样式按钮
			Intent intent = new Intent(this, SetTextViewActivity.class);
			startActivity(intent);
			break;
		}
		}
	}

}
