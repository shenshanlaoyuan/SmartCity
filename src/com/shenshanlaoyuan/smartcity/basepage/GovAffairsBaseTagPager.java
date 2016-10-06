package com.shenshanlaoyuan.smartcity.basepage;

import android.view.Gravity;
import android.widget.TextView;

import com.shenshanlaoyuan.smartcity.activity.MainActivity;

public class GovAffairsBaseTagPager extends BaseTagPage {

	public GovAffairsBaseTagPager(MainActivity context) {
		super(context);
	}

	@Override
	public void initData() {
		// 设置本page的标题
		tv_title.setText("政务");

		// 要展示的内容，
		TextView tv = new TextView(mainActivity);
		tv.setText("政务的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);

		// 替换掉白纸
		fl_content.addView(tv);// 添加自己的内容到白纸上
		super.initData();
	}

}
