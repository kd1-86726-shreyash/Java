package com.shreyash;

import java.util.Scanner;

public class Palindrome {

	public static String isPalindrome(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}

		return rev;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter A String To Check Its Palindrome - ");
		String str = sc.nextLine();

		String temp = isPalindrome(str);
		if (str.equals(temp)) {
			System.out.println("Entered String is Palindrome");
		} else {
			System.out.println("Entered String is not Palindrome");
		}

	}

}
