package com.shreyash;

import java.util.Scanner;

public class InputString {

	String input;

	public InputString() {
	}

	public InputString(String input) {
		this.input = input;
	}

	public void accept(Scanner sc) {
		System.out.println("Enter Any String - ");
		input = sc.nextLine();
		if (input.length() > 80)
			throw new ExceptionLineTooLong("The string is too long");
	}

	@Override
	public String toString() {
		return "InputString [ Input=" + input + "]";
	}

}
