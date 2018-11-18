package com.csc.beans;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("deprecation")
public class WishMsgGenerator {
	private static final Logger log = LoggerFactory.getLogger(WishMsgGenerator.class);

	static {
		log.info("Inside Static block");
	}

	public WishMsgGenerator(Date date) {
		this.date = date;	
		log.info("WishMsgGenerator(date):: 1-param Constructor");
	}

	private Date date;

	public WishMsgGenerator() {
		log.info("WishMsgGenerator():: 0-param Constructor");
	}

	public String generateWishMsg(String name) {
		log.info("Inside generateWishMsg() :: method");
		int hour = 0;
		hour = date.getHours();
		log.info("Time is:: " + date.toLocaleString());
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
