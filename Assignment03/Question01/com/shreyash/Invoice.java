package com.shreyash;

import java.util.Scanner;

public class Invoice {
	Scanner sc = new Scanner(System.in);
	double invoiceAmount = 0;

	String partNumber;
	String partDescription;
	int partQuantity;
	double partPrice;

	public Invoice() {

	}

	public Invoice(String partNumber, String partDescription, int partQuantity, double partPrice) {
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.partQuantity = partQuantity;
		this.partPrice = partPrice;
	}

	public String getPartNumber() {
		return partNumber;
	}

	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}

	public String getPartDescription() {
		return partDescription;
	}

	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}

	public int getPartQuantity() {
		return partQuantity;
	}

	public void setPartQuantity(int partQuantity) {
		this.partQuantity = partQuantity;
	}

	public double getPartPrice() {
		return partPrice;
	}

	public void setPartPrice(double partPrice) {
		this.partPrice = partPrice;
	}

	public void accept() {
		System.out.print("Enter Part Number - ");
		partNumber = sc.next();
		System.out.print("Enter Part Description - ");
		partDescription = sc.next();
		System.out.print("Enter Part Quantity - ");
		partQuantity = sc.nextInt();
		System.out.print("Enter Part Price - ");
		partPrice = sc.nextDouble();
	}
	
	public void display() {
		System.out.println();
	}

	public double calcInvoice() {
//		if (this.partPrice < 0) {
//			this.partPrice = 0.0;
//		}
//		if (this.partQuantity < 0) {
//			this.partQuantity = 0;
//		}
		invoiceAmount = this.partQuantity * this.partPrice;
		return invoiceAmount;
	}

}
