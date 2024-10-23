package com.shreyash;

import java.util.Scanner;

public class Student implements Comparable<Student> {
	private int rollNo;
	private String name;
	private String city;
	private double marks;

	public Student() {
	}

	public Student(int rollNo, String name, String city, double marks) {
		this.rollNo = rollNo;
		this.name = name;
		this.city = city;
		this.marks = marks;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getMarks() {
		return marks;
	}

	public void setMarks(double marks) {
		this.marks = marks;
	}

	public void accept(Scanner sc) {
		System.out.print("Enter RollNo - ");
		rollNo = sc.nextInt();
		System.out.print("Enter Name - ");
		name = sc.next();
		System.out.print("Enter City - ");
		city = sc.next();
		System.out.print("Enter Marks - ");
		marks = sc.nextDouble();
	}

	@Override
	public String toString() {
		return "Student [RollNo = " + rollNo + ", Name=" + name + ", City = " + city + ", Marks = " + marks + "]";
	}

	@Override
	public int compareTo(Student s1) {
		return this.rollNo - s1.rollNo;
	}

}
