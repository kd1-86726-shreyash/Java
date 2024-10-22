package com.shreyash;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A String To Reverse - ");
		String str = sc.nextLine();

		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}

		System.out.println("Reverse String = " + rev);

	}
}
