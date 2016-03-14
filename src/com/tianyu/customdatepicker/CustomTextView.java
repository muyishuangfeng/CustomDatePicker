package com.tianyu.customdatepicker;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 让TextView看起来发光
 * 
 */
public class CustomTextView extends TextView {

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		AssetManager assets = context.getAssets();
		final Typeface font = Typeface.createFromAsset(assets,
				"fonts/digital-7.ttf");
		setTypeface(font);
	}

}
