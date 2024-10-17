package com.shreyash;

public class Main {

	public static void main(String[] args) {
		Employee arr[] = new Employee[2];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Employee();
			arr[i].acceptEmployee();
			System.out.println();
		}

		for (Employee e : arr) {
			if (e.getSalary() < 0) {
				e.setSalary(0.0);
			}
		}

		for (Employee e1 : arr) {
			e1.setSalary(e1.salary * 12);
		}

		System.out.println();
		System.err.println("Yearly Salary - ");
		System.out.println();
		for (Employee e2 : arr) {
			System.out.println("FirstName = " + e2.getFirstname());
			System.out.println("LastName = " + e2.getLastName());
			System.out.println("Yearly Salary = " + e2.getSalary());
		}

		for (Employee e3 : arr) {
			e3.setSalary(e3.getSalary() + (e3.getSalary() * 0.1));
		}

		System.out.println();
		System.err.println("Salary After 10% Raise - ");
		System.out.println();

		for (Employee e4 : arr) {
			System.out.println("FirstName = " + e4.getFirstname());
			System.out.println("LastName = " + e4.getLastName());
			System.out.println("Yearly Salary = " + e4.getSalary());
		}
	}

}
