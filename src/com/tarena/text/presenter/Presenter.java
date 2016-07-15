package com.tarena.text.presenter;

import java.util.List;

import com.tarena.text.entity.Result;
import com.tarena.text.model.IModel;
import com.tarena.text.model.IModelCallback;
import com.tarena.text.model.Model;
import com.tarena.text.view.IView;

public class Presenter implements IPresenterData{
	private IView view;
	private IModel model;
	
	
	public Presenter(IView view) {
		this.view = view;
		model=new Model();
	}


	@Override
	public void loadData() {
			model.getText(new IModelCallback() {
				
				@Override
				public void findData(Object object) {
					List<Result>results=(List<Result>) object;
					view.setData(results);
					view.showData();
				}
			});
	}

}
