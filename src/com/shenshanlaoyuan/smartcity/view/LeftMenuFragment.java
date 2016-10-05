package com.shenshanlaoyuan.smartcity.view;

import android.view.Gravity;
import android.view.View;
import android.widget.TextView;

/**
 * @author hp
 * 
 *         左侧菜单的fragment
 */
public class LeftMenuFragment extends BaseFragment {

	@Override
	public View initView() {
		// TODO Auto-generated method stub
		TextView tv = new TextView(mainActivity);
		tv.setText("左侧菜单");
		tv.setTextSize(25);
		tv.setGravity(Gravity.CENTER);
		return tv;
	}

}
