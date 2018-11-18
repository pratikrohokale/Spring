package com.csc.beans;

import java.util.Date;

@SuppressWarnings("deprecation")
public class WishMsgGenerator {
	
	
	static{
		System.out.println("Inside Static block");
	}
		
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}

	public WishMsgGenerator() {
		System.out.println("WishMsgGenerator():: 0-param Constructor");
	}

	public String generateWishMsg(String name) {
		System.out.println("Inside generateWishMsg() :: method");
		int hour = 0;
		hour = date.getHours();
		System.out.println("Time is:: " + date.toLocaleString());
		if (hour < 12)
			return "Good morning " + name;
		else if (hour < 16) {
			return "Good Afternoon" + name;
		} else if (hour < 20) {
			return "Good Evening" + name;
		} else {
			return "Good Night" + name;
		}
	}

}
