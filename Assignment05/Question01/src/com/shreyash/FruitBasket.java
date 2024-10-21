package com.shreyash;

import java.util.Scanner;

public class FruitBasket {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {

		System.out.println("\n-----MENU-----");
		System.out.println("0.EXIT");
		System.out.println("1.ADD MANGO");
		System.out.println("2.ADD ORANGE");
		System.out.println("3.ADD APPLE");
		System.out.println("4.DISPLAY NAMES OF FRUITS");
		System.out.println("5.DISPLAY FRUITS");
		System.out.println("6.DISPLAY TASTE OF ALL STALE FRUITS");
		System.out.println("7.MARK FRUIT AS STALE");
		System.out.println("8.MARK ALL SOUR FRUITS AS STALE");

		System.out.print("\nEnter Your Choice - ");
		int choice = sc.nextInt();

		return choice;
	}

	public static void main(String[] args) {
		Fruit fruitBasket[] = new Fruit[3];

		int choice = 0;
		int counter = 0;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 1: {
				fruitBasket[counter] = new Mango();
				fruitBasket[counter].accept(sc);
				counter++;
			}
				break;

			case 2: {
				fruitBasket[counter] = new Orange();
				fruitBasket[counter].accept(sc);
				counter++;
			}
				break;

			case 3: {
				fruitBasket[counter] = new Apple();
				fruitBasket[counter].accept(sc);
				counter++;
			}
				break;

			case 4: {
				for (int i = 0; i < fruitBasket.length; i++) {
					if (fruitBasket[i] != null)
						System.out.println(fruitBasket[i].getName());
				}
			}
				break;

			case 5: {
				for (int i = 0; i < fruitBasket.length; i++) {
					if (fruitBasket[i] != null && fruitBasket[i].isFresh()) {
						System.out.println(fruitBasket[i].toString());
						System.out.println("Taste =" + fruitBasket[i].taste());
						System.out.println("Fresh = " + fruitBasket[i].isFresh());
					}
				}
			}
				break;

			case 6: {
				for (int i = 0; i < fruitBasket.length; i++) {
					if (!fruitBasket[i].isFresh()) {
						System.out.println("Fruit = " + fruitBasket[i].getName());
						System.out.println("Taste = " + fruitBasket[i].taste());
					}
				}

			}
				break;

			case 7: {
				System.out.println("Enter Index To Mark As Stale - ");
				int index = sc.nextInt();

				if (index <= counter && index > -1) {
					fruitBasket[index].setFresh(false);
				} else {
					System.out.println("Index Not Found");
				}

			}
				break;

			case 8: {

				for (int i = 0; i < fruitBasket.length; i++) {
					if (fruitBasket[i].taste().equals("Sour")) {
						fruitBasket[i].setFresh(false);
					}
				}

			}
				break;

			default: {
				System.out.println("Invalid Choice !");
			}
				break;
			}
		}
	}
}
