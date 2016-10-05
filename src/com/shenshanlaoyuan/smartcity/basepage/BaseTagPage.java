package com.shenshanlaoyuan.smartcity.basepage;



import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;

import com.shenshanlaoyuan.smartcity.R;
import com.shenshanlaoyuan.smartcity.activity.MainActivity;


/**
 * @author Administrator
 * @创建时间 2015-7-4 下午5:24:12
 * @描述 TODO
 *
 * @ svn提交者：$Author: gd $
 * @ 提交时间: $Date: 2015-07-06 14:57:36 +0800 (Mon, 06 Jul 2015) $
 * @ 当前版本: $Rev: 28 $
 */
public class BaseTagPage
{
	protected MainActivity mainActivity;
	protected View	root;
	protected ImageButton	ib_menu;//按钮ib
	protected TextView	tv_title;
	protected FrameLayout	fl_content;
	public BaseTagPage(MainActivity context){
		this.mainActivity = context;
		initView();//初始化布局
		
		initEvent();
	}

	public  void initView() {
		//界面的根布局
		root = View.inflate(mainActivity, R.layout.fragment_content_base_content, null);
		
		ib_menu = (ImageButton) root.findViewById(R.id.ib_base_content_menu);
		
		tv_title = (TextView) root.findViewById(R.id.tv_base_content_title);
		
		fl_content = (FrameLayout) root.findViewById(R.id.fl_base_content_tag);
	}
	
	public void initEvent(){
		//给菜单按钮添加点击事件
		ib_menu.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				//打开或者关闭左侧菜单
				mainActivity.getSlidingMenu().toggle();//左侧菜单的开关
			}
		});
	}
	
	/**
	 * 此方法在该页面数据显示的时候再调用
	 */
	public void initData(){
		
	}
	
	public void switchPage(int position){
		
	}
	
	
	public View getRoot(){
		return root;
	}
}
