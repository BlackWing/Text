package com.tarena.text.util;

import java.util.List;

import com.tarena.text.entity.Result;

public class QuerResult {
	private String error;
	private List<Result> results;
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	
}
