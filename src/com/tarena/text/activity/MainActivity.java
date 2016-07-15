package com.tarena.text.activity;

import java.util.List;

import com.tarena.text.R;
import com.tarena.text.R.layout;
import com.tarena.text.R.menu;
import com.tarena.text.adapter.MyAdapter;
import com.tarena.text.entity.Result;
import com.tarena.text.presenter.IPresenterData;
import com.tarena.text.presenter.Presenter;
import com.tarena.text.view.IView;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity implements IView {
	private ListView lvText;
	private IPresenterData presenterData;
	private List<Result> results;
	private MyAdapter adapter;

	public MainActivity() {
		super();
		presenterData = new Presenter(this);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		lvText = (ListView) findViewById(R.id.lv);
		presenterData.loadData();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public void setData(List<Result> results) {
		this.results = results;
	}

	@Override
	public void showData() {
		adapter = new MyAdapter(this, results);
		lvText.setAdapter(adapter);
	}

}
