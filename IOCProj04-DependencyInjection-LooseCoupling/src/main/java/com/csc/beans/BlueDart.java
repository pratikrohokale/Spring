package com.csc.beans;

public class BlueDart implements Courier {
	public BlueDart() {
		System.out.println("BlueDart:0-param constructor");
	}

	public void deliver(int OrderId) {
		System.out.println("OdrerId:: " + OrderId + " has been delivered via BlueDart");
	}
}
