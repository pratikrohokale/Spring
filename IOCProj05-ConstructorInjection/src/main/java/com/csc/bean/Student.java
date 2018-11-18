package com.csc.bean;

public class Student {
	private String sname;
	private int sno;
	private float avg;

	public Student(String sname, int sno, float avg) {
		System.out.println("Student(-,-,-)::3-param Constructor");
		this.sname = sname;
		this.sno = sno;
		this.avg = avg;
	}

	public Student() {
		System.out.println("Student()::0-param Constructor");
	}

	public void showDetails() {
		System.out.println("sno::" + sno + ", sname::" + sname + ", avg::" + avg);
	}

}
