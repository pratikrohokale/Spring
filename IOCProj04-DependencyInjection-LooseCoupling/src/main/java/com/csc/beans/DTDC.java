package com.csc.beans;

public class DTDC implements Courier {
	public DTDC() {
		System.out.println("DTDC:0-param constructor");
	}

	public void deliver(int OrderId) {
		System.out.println("OdrerId:: " + OrderId + " has been delivered via DTDC");
	}
}
