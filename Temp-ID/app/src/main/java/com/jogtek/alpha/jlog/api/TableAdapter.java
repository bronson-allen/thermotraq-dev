package com.jogtek.alpha.jlog.api;

import java.util.List;
import java.util.Map;

import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.SimpleAdapter;
import android.widget.TableLayout;
import android.widget.TextView;

public class TableAdapter extends SimpleAdapter {
	private int[] to;
	private String[] title;
	private View titleView;

	public TableAdapter(Context context, List<? extends Map<String, ?>> data,
			int resource, String[] from, int[] to, String[] title) {
		super(context, data, resource, from, to);
		this.to = to;
		this.title = title;
		titleView = LayoutInflater.from(context).inflate(resource, null);
		createTitleView();
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View view = super.getView(position, convertView, parent);
		return view;
	}

	public void createTitleView() {
		int count = to.length;
		for (int i = 0; i < count; i++) {
			View v = titleView.findViewById(to[i]);
			if (v != null) {
//				RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(
//						RelativeLayout.LayoutParams.WRAP_CONTENT,
//						RelativeLayout.LayoutParams.WRAP_CONTENT);
//				layoutParams.addRule(RelativeLayout.CENTER_IN_PARENT);
				if (v instanceof TextView) {
					((TextView) v).setText(title[i]);
					((TextView) v).setTextColor(Color.WHITE);
					((TextView) v).setTextSize(16);
					((TextView) v).setGravity(Gravity.CENTER);
//					((TextView) v).setLayoutParams(layoutParams);
					// v.setPadding(0, 7, 0, 6);
				}
			}
		}
		setTitleView(titleView);
	}

	public View getTitleView() {
		return titleView;
	}

	public void setTitleView(View titleView) {
		this.titleView = titleView;
	}
}
