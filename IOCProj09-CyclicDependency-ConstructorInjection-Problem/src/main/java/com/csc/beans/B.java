package com.csc.beans;

@SuppressWarnings("unused")
public class B {
	private A a;

	public B(A a) {
		this.a = a;
	}

	@Override
	public String toString() {
		return "B [a]";
	}

}
