package com.tarena.text.app;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class Myapplication extends Application {
	private static Myapplication context;
	private static RequestQueue queue;

	@Override
	public void onCreate() {
		super.onCreate();
		context = this;
		queue = Volley.newRequestQueue(this);

	}

	public static Myapplication getContext() {
		return context;
	}

	public static RequestQueue getRequestQueue() {
		return queue;

	}

}
