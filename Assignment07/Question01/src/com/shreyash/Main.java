package com.shreyash;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class CityComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getCity().compareTo(s2.getCity());
	}
}

class MarksComparatorDesc implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return -Double.compare(s1.getMarks(), s2.getMarks());
	}
}

class NameComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return s1.getName().compareTo(s2.getName());
	}
}

public class Main {

	public static int menu(Scanner sc) {
		System.out.println("\n-----Menu-----");
		System.out.println("0.EXIT");
		System.out.println("1.ADD STUDENTS");
		System.out.println("2.DISPLAY STUDENTS");
		System.out.println("3.DISPLAY STUDENTS SORTED ON THEIR CITY(ASC)");
		System.out.println("4.DISPLAY STUDENTS SORTED ON THEIR MARKS(DESC)");
		System.out.println("5.DISPLAY STUDENTS SORTED ON THEIR NAME(ASC)");
		System.out.println("6.DISPLAY STUDENTS SORTED ON THEIR ROll_NO(ASC)");

		System.out.println("\nEnter Your Choice - ");
		int ch = sc.nextInt();
		return ch;
	}

	public static void displayStudents(Student arr[]) {
		for (Student stud : arr) {
			System.out.println(stud);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter How Many Students to Add in Array - ");
//		int size = sc.nextInt();
		int choice;
		int index = 0;
		Student arr[] = new Student[3];

		while ((choice = menu(sc)) != 0) {

			switch (choice) {
			case 1: {
				if (index < 3) {
					arr[index] = new Student();
					arr[index].accept(sc);
					index++;
				} else {
					System.out.println("Array is Full Cant Add Students ");
				}
			}
				break;

			case 2: {
				displayStudents(arr);
			}
				break;

			case 3: {
				Arrays.sort(arr, new CityComparator());
				displayStudents(arr);
			}
				break;

			case 4: {
				Arrays.sort(arr, new MarksComparatorDesc());
				displayStudents(arr);
			}
				break;

			case 5: {
				Arrays.sort(arr, new NameComparator());
				displayStudents(arr);
			}
				break;

			case 6: {
				Arrays.sort(arr);
				displayStudents(arr);
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
