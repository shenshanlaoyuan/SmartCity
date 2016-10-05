package com.shenshanlaoyuan.smartcity.basepage;


import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

public class GovAffairsBaseTagPager extends BaseTagPage
{

	public GovAffairsBaseTagPager(Context context) {
		super(context);
	}
	@Override
	public void initData() {
		tv_title.setText("政务");
		
		TextView tv = new TextView(context);
		tv.setText("政务的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		super.initData();
	}

}
