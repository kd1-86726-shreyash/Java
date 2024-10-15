import java.util.Scanner;

public class Program02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		double finalBill = 0;

		do {
			System.out.println();
			System.out.println("-----MENU-----");
			System.out.println();
			System.out.println("0.EXIT");
			System.out.println("1.DOSA = 50");
			System.out.println("2.Samosa = 15");
			System.out.println("3.Idli = 20");
			System.out.println("4.VadavPav = 12");
			System.out.println("5.Pattice = 18");
			System.out.println("6.Uthappa = 60");

			System.out.println();
			System.out.print("Enter Your MenuList - ");
			choice = sc.nextInt();

			switch (choice) {
			case 0: {
				System.out.println();
				System.out.println("Thank You");
			}
				break;
			case 1: {
				finalBill = finalBill + 50;
			}
				break;
			case 2: {
				finalBill = finalBill + 15;
			}
				break;
			case 3: {
				finalBill = finalBill + 20;
			}
				break;
			case 4: {
				finalBill = finalBill + 12;
			}
				break;
			case 5: {
				finalBill = finalBill + 18;
			}
				break;
			case 6: {
				finalBill = finalBill + 60;
			}
				break;

			default: {
				System.out.println("Invalid Input !");
			}
				break;
			}

		} while (choice != 0);

		System.out.println("FinalBill = " + finalBill);

	}

}
