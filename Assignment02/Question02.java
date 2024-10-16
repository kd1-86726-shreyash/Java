import java.util.Scanner;

public class Program02 {

	static Scanner sc = new Scanner(System.in);

	public static int menu() {
		System.out.println();
		System.out.println("-----MENU-----");
		System.out.println();
		System.out.println("1.DOSA = 50");
		System.out.println("2.Samosa = 15");
		System.out.println("3.Idli = 20");
		System.out.println("4.VadavPav = 12");
		System.out.println("5.Pattice = 18");
		System.out.println("6.Uthappa = 60");
		System.out.println("0.Generate Bill");

		System.out.println();
		System.out.print("Enter Your Menu Choice - ");
		int choice = sc.nextInt();

		return choice;

	}

	public static void main(String[] args) {
		double finalBill = 0;
		int choice = 0;
		int quantity;

		while ((choice = menu()) != 0) {
			switch (choice) {
			case 0: {
				System.out.println();
				System.out.println("Thank You");
			}
				break;
			case 1: {
				System.out.println("Enter Quantity Required - ");
				quantity = sc.nextInt();
				finalBill = finalBill + (50 * quantity);
			}
				break;
			case 2: {
				System.out.println("Enter Quantity Required - ");
				quantity = sc.nextInt();
				finalBill = finalBill + (15 * quantity);
			}
				break;
			case 3: {
				System.out.println("Enter Quantity Required - ");
				quantity = sc.nextInt();
				finalBill = finalBill + (20 * quantity);
			}
				break;
			case 4: {
				System.out.println("Enter Quantity Required - ");
				quantity = sc.nextInt();
				finalBill = finalBill + (12 * quantity);
			}
				break;
			case 5: {
				System.out.println("Enter Quantity Required - ");
				quantity = sc.nextInt();
				finalBill = finalBill + (18 * quantity);
			}
				break;
			case 6: {
				System.out.println("Enter Quantity Required - ");
				quantity = sc.nextInt();
				finalBill = finalBill + (60 * quantity);
			}
				break;

			default: {
				System.out.println("Invalid Input !");
			}
				break;
			}
		}

		System.out.println();
		System.out.println("FinalBill = " + finalBill);

	}

}
