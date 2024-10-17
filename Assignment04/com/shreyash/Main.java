package com.shreyash;

public class Main {
	public static void main(String[] args) {
		Point2D p1 = new Point2D();
		p1.accept();
		Point2D p2 = new Point2D();
		p2.accept();

		p1.calculateDistance(p2);
	}
}
