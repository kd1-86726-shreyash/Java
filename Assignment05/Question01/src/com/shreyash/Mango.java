package com.shreyash;

import java.util.Scanner;

public class Mango extends Fruit {

	public Mango() {
		super("Mango");
	}

	@Override
	public String taste() {
		return "Sweet";
	}

	public void accept(Scanner sc) {
		System.out.println("Enter Weight - ");
		weight = sc.nextDouble();
		System.out.println("Enter Color - ");
		colour = sc.next();
	}

}
