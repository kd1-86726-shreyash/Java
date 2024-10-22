package com.shreyash;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		InputString i = new InputString();

		try {
			i.accept(sc);
		} catch (ExceptionLineTooLong e) {
			e.printStackTrace();
		}

		System.out.println(i);

	}

}
