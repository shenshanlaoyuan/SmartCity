package com.shenshanlaoyuan.smartcity.newscenterpage;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

import com.shenshanlaoyuan.smartcity.activity.MainActivity;

public class PhotosBaseNewsCenterPage extends BaseNewsCenterPage {

	public PhotosBaseNewsCenterPage(MainActivity mainActivity) {
		super(mainActivity);
		// TODO Auto-generated constructor stub
	}

	@Override
	public View initView() {
		TextView tv = new TextView(mainActivity);
		tv.setText("组图的内容");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		return tv;
	}

}
