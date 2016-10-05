package com.shenshanlaoyuan.smartcity.basepage;


import android.content.Context;
import android.view.Gravity;
import android.widget.TextView;

public class SmartServiceBaseTagPager extends BaseTagPage
{

	public SmartServiceBaseTagPager(Context context) {
		super(context);
	}
	@Override
	public void initData() {
		tv_title.setText("智慧服务");
		
		TextView tv = new TextView(context);
		tv.setText("智慧服务的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		super.initData();
	}

}
