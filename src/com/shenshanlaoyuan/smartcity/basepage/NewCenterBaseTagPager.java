package com.shenshanlaoyuan.smartcity.basepage;


import com.shenshanlaoyuan.smartcity.activity.MainActivity;

import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;


public class NewCenterBaseTagPager extends BaseTagPage
{

	public NewCenterBaseTagPager(MainActivity context) {
		super(context);
	}
	
	@Override
	public void initData() {
		tv_title.setText("新闻中心");
		
		TextView tv = new TextView(mainActivity);
		tv.setText("新闻中心的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		super.initData();
	}

}
