package com.shreyash;

import java.util.Scanner;

public abstract class Fruit {

	String colour;
	double weight;
	String name;
	boolean isFresh = true;

	public Fruit() {

	}
	
	public Fruit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean isFresh() {
		return isFresh;
	}

	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}

	public abstract String taste();

	public abstract void accept(Scanner sc);

	@Override
	public String toString() {
		return "Fruit [colour=" + colour + ", weight=" + weight + ", name=" + name;
	}

}
