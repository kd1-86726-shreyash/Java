package com.shreyash;

import java.util.Scanner;

public class Apple extends Fruit {

	public Apple() {
		super("Apple");
	}

	@Override
	public String taste() {
		return "SweetNSour";
	}

	public void accept(Scanner sc) {
		System.out.println("Enter Weight - ");
		weight = sc.nextDouble();
		System.out.println("Enter Color - ");
		colour = sc.next();

	}

}
