package com.shreyash;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		double invoiceAmount = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter The How Many Parts You Want Buy - ");
		int size = sc.nextInt();
		Invoice arr[] = new Invoice[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = new Invoice();
			arr[i].accept();
			System.out.println();
		}

		for (Invoice i1 : arr) {
			if (i1.getPartPrice() < 0) {
				i1.setPartPrice(0.0);
			}

			if (i1.getPartQuantity() < 0) {
				i1.setPartQuantity(0);
			}
		}

		for (int i = 0; i < arr.length; i++) {
			invoiceAmount += arr[i].calcInvoice();
		}

//		System.out.println("PartNo\t" + "Part_Name\t" + "Quantity\t" + "Price");
		System.out.println("finalBill = " + invoiceAmount);

	}

}
