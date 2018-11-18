package com.csc.beans;

import java.util.Arrays;
import java.util.Random;

public class Flipkart {

	public Flipkart() {
		System.out.println("Flipkart::0-param Constructor");
	}

	private Courier courier;

	public void setCourier(Courier courier) {
		this.courier = courier;
	}

	public void shopping(String items[]) {
		float billAmt = 0.0f;
		int orderId = 0;
		Random rad = new Random();
		orderId = rad.nextInt(1000);
		billAmt = items.length * 500;
		System.out.println(
				"Item List:: " + Arrays.toString(items) + " OrderId :: " + orderId + " Bill Amount:: " + billAmt);
		courier.deliver(orderId);
	}

}
