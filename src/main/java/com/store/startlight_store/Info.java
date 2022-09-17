package com.store.startlight_store;

public class Info {

	private String key;
	private String value;
	
	public Info(String k,String v)
	{
		this.key = k;
		this.value = v;
	}
	public String getKey()
	{
		return key;
	}
	public void setKey(String key)
	{
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
}
