package com.munggu.org;

public class User {
	private int idx;
	private String name;
	
	@Override
	public String toString() {
		return "User [idx=" + idx + ", name=" + name + "]";
	}
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}
