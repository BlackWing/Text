package com.tarena.text.model;

import java.util.ArrayList;
import java.util.List;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.tarena.text.app.Myapplication;
import com.tarena.text.entity.Result;
import com.tarena.text.util.QuerResult;

public class Model implements IModel {
	private RequestQueue queue;

	public Model() {
		queue = Volley.newRequestQueue(Myapplication.getContext());
	}

	@Override
	public void getText(final IModelCallback callback) {
		String url = "http://gank.io/api/data/Android/10/1";
		StringRequest request = new StringRequest(StringRequest.Method.GET,
				url, new Response.Listener<String>() {

					@Override
					public void onResponse(String response) {
						List<Result> results = new ArrayList<Result>();
						Gson gson = new Gson();
						QuerResult quer = gson.fromJson(response,
								QuerResult.class);
						results = quer.getResults();
						callback.findData(results);
					}
				}, new Response.ErrorListener() {

					@Override
					public void onErrorResponse(VolleyError error) {

					}
				});
		queue.add(request);
	}

}
