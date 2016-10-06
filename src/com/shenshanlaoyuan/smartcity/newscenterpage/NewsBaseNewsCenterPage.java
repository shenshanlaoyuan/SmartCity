package com.shenshanlaoyuan.smartcity.newscenterpage;

import java.util.ArrayList;
import java.util.List;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lidroid.xutils.ViewUtils;
import com.lidroid.xutils.view.annotation.ViewInject;
import com.shenshanlaoyuan.smartcity.R;
import com.shenshanlaoyuan.smartcity.activity.MainActivity;
import com.shenshanlaoyuan.smartcity.domain.NewsCenterData;
import com.shenshanlaoyuan.smartcity.domain.NewsCenterData.NewsData.ViewTagData;
import com.viewpagerindicator.TabPageIndicator;

public class NewsBaseNewsCenterPage extends BaseNewsCenterPage {

	@ViewInject(R.id.newcenter_vp)
	private ViewPager vp_newscenter;

	@ViewInject(R.id.newcenter_tpi)
	private TabPageIndicator tpi_newscenter;

	private List<ViewTagData> viewTagDatas = new ArrayList<NewsCenterData.NewsData.ViewTagData>(); // 页签的数据

	public NewsBaseNewsCenterPage(MainActivity mainActivity,
			List<ViewTagData> children) {
		super(mainActivity);
		// TODO Auto-generated constructor stub
		this.viewTagDatas = children;
	}

	@Override
	public View initView() {
		View newsCenterRoot = View.inflate(mainActivity,
				R.layout.newscenterpage_content, null);
		// xutils工具注入组件
		ViewUtils.inject(this, newsCenterRoot);

		return newsCenterRoot;
	}

	@Override
	public void initData() {
		// 设置数据
		MyAdapter adapter = new MyAdapter();

		// 设置ViewPager的适配器
		vp_newscenter.setAdapter(adapter);

		// 把ViewPager和Tabpagerindicator关联
		tpi_newscenter.setViewPager(vp_newscenter);
		super.initData();
	}

	/**
	 * @author hp
	 * 
	 *         页签对应ViewPage的适配器
	 * 
	 */
	private class MyAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return viewTagDatas.size();// 获取数据的个数
		}

		/**
		 * 页签显示数据调用该方法
		 */
		@Override
		public CharSequence getPageTitle(int position) {
			// 获取页签的数据
			return viewTagDatas.get(position).title;
		}

		@Override
		public boolean isViewFromObject(View view, Object object) {
			// TODO Auto-generated method stub
			return view == object;
		}

		@Override
		public Object instantiateItem(ViewGroup container, int position) {
			// 要展示的内容，
			TextView tv = new TextView(mainActivity);
			tv.setText(viewTagDatas.get(position).title);
			tv.setTextSize(25);
			tv.setGravity(Gravity.CENTER);

			container.addView(tv);

			return tv;
		}

		@Override
		public void destroyItem(ViewGroup container, int position, Object object) {
			// TODO Auto-generated method stub
			container.removeView((View) object);
		}

	}

}
