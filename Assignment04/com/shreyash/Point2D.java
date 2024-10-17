package com.shreyash;

import java.util.Scanner;

public class Point2D {
	Scanner sc = new Scanner(System.in);
	int xCord;
	int yCord;

	public Point2D() {

	}

	public Point2D(int xCord, int yCord) {
		super();
		this.xCord = xCord;
		this.yCord = yCord;
	}

	public int getxCord() {
		return xCord;
	}

	public void setxCord(int xCord) {
		this.xCord = xCord;
	}

	public int getyCord() {
		return yCord;
	}

	public void setyCord(int yCord) {
		this.yCord = yCord;
	}

	public void accept() {
		System.out.print("Enter X_Cord - ");
		xCord = sc.nextInt();
		System.out.print("Enter Y_Cord - ");
		yCord = sc.nextInt();
	}

	public String getDetails() {
		return "xCord=" + getxCord() + " , yCord=" + getyCord() + "";
	}

	public boolean isEqual(Point2D p2) {
		if (this.xCord == p2.xCord && this.yCord == p2.yCord) {
			return true;
		}
		return false;
	}

	public void calculateDistance(Point2D p2) {
		if (this.isEqual(p2)) {
			System.out.println("Both the Points Are Same");
			System.out.println(this.getDetails());
			System.out.println(p2.getDetails());
		} else {
			double distance = Math.sqrt((Math.pow(this.xCord - p2.xCord, 2)) + (Math.pow(this.yCord - p2.yCord, 2)));
			System.out.println();
			System.out.println("Distance = " + distance);
		}
	}

}
