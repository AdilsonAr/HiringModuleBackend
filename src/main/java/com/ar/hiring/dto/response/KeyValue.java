package com.ar.hiring.dto.response;

public class KeyValue {
	private String key;
	private Object val;
	
	public KeyValue() {
		super();
	}
	public KeyValue(String key, Object val) {
		super();
		this.key = key;
		this.val = val;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public Object getVal() {
		return val;
	}
	public void setVal(Object val) {
		this.val = val;
	}
	
}
