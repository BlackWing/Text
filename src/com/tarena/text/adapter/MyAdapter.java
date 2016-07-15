package com.tarena.text.adapter;

import java.util.List;

import com.tarena.text.R;
import com.tarena.text.entity.Result;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class MyAdapter extends BaseAdapter {
	private Context context;
	private List<Result> results;
	private LayoutInflater layoutInflater;

	public MyAdapter(Context context, List<Result> results) {
		super();
		this.context = context;
		this.results = results;
		this.layoutInflater = layoutInflater.from(context);
	}

	@Override
	public int getCount() {
		return results.size();
	}

	@Override
	public Result getItem(int position) {
		return results.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Result result=getItem(position);
		ViewHolder holder;
		if (convertView==null) {
			holder=new ViewHolder();
			convertView=layoutInflater.inflate(R.layout.lv_item, null);
			holder.text=(TextView) convertView.findViewById(R.id.text);
			holder.writer=(TextView) convertView.findViewById(R.id.writer);
			convertView.setTag(holder);
		}
		holder=(ViewHolder) convertView.getTag();
		holder.text.setText(result.getDesc());
		holder.writer.setText(result.getWho());
		return convertView;
	}

	class ViewHolder {
		TextView text;
		TextView writer;
	}
}
