package com.shreyash;

import java.util.Scanner;

public class Employee {
	Scanner sc = new Scanner(System.in);

	String firstname;
	String lastName;
	double salary;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String firstname, String lastName, double salary) {
		this.firstname = firstname;
		this.lastName = lastName;
		this.salary = salary;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void acceptEmployee() {
		System.out.print("Enter Employee's FirstName - ");
		firstname = sc.next();
		System.out.print("Enter Employee's LastName - ");
		lastName = sc.next();
		System.out.print("Enter Employee's Salary - ");
		salary = sc.nextDouble();
	}

	public void displayEmployee() {
		System.out.println("Employee FirstName = " + this.firstname);
		System.out.println("Employee LastName = " + this.lastName);
		System.out.println("Employee Salary = " + this.salary);
	}
}
