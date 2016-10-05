package com.shenshanlaoyuan.smartcity.basepage;


import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;


public class HomeBaseTagPager extends BaseTagPage
{

	public HomeBaseTagPager(Context context) {
		super(context);
	}
	@Override
	public void initData() {
		tv_title.setText("首页");
		
		TextView tv = new TextView(context);
		tv.setText("首页的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		super.initData();
	}
}
