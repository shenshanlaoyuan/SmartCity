package com.shenshanlaoyuan.smartcity.activity;

import android.os.Bundle;
import android.view.Window;

import com.jeremyfeinstein.slidingmenu.lib.SlidingMenu;
import com.jeremyfeinstein.slidingmenu.lib.app.SlidingFragmentActivity;
import com.shenshanlaoyuan.smartcity.R;
import com.shenshanlaoyuan.smartcity.view.LeftMenuFragment;
import com.shenshanlaoyuan.smartcity.view.MainContentFragment;

/**
 * @author hp
 * 
 *         智慧城市的主界面
 */
public class MainActivity extends SlidingFragmentActivity {
	private static final String LEFT_MUNE_TAG = "LEFT_MUNE_TAG";
	private static final String MAIN_MUNE_TAG = "MAIN_MUNE_TAG";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);// 隐藏标题
		initView();// 初始化界面
		initData();// 初始化数据

	}

	/**
	 * 初始化数据
	 */
	private void initData() {
		android.support.v4.app.FragmentManager fragmentManager = getSupportFragmentManager();
		// 1. 获取事物
		android.support.v4.app.FragmentTransaction transaction = fragmentManager
				.beginTransaction();
		// 2. 完成替换

		// 完成左侧菜单界面的替换
		transaction.replace(R.id.fl_left_menu, new LeftMenuFragment(),
				LEFT_MUNE_TAG);

		// 完成左侧菜单界面的替换
		transaction.replace(R.id.fl_main_menu, new MainContentFragment(),
				MAIN_MUNE_TAG);

		// 3.提交事物
		transaction.commit();
	}

	private void initView() {
		// 设置主界面
		setContentView(R.layout.fragment_content_tag);

		// 设置左侧菜单界面
		setBehindContentView(R.layout.fragment_left);

		// 设置滑动模式
		SlidingMenu sm = getSlidingMenu();
		sm.setMode(SlidingMenu.LEFT);// 只设置左侧可以滑动

		// 设置滑动位置为全屏
		sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

		// 设置主界面左侧滑动后剩余的空间位置
		sm.setBehindOffset(200);// 设置主界面剩余的位置

	}
}