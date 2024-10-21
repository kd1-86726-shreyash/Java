package com.shreyash;

import java.util.Scanner;

public class Orange extends Fruit {

	public Orange() {
		super("Orange");
	}

	@Override
	public String taste() {
		return "Sour";
	}

	public void accept(Scanner sc) {
		System.out.println("Enter Weight - ");
		weight = sc.nextDouble();
		System.out.println("Enter Color - ");
		colour = sc.next();
	}

}
