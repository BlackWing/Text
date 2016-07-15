package com.tarena.text.view;

import java.util.List;

import com.tarena.text.entity.Result;



public interface IView {
	void setData(List<Result> results);

	void showData();
}
