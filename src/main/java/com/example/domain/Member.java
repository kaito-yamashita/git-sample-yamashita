package com.example.domain;

public class Member {
	private String name;
	@Override
	public String toString() {
		return name;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}