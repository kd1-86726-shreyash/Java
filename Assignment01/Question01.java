import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;

		System.out.print("Enter 1st Double Value - ");
		if (sc.hasNextDouble() && !sc.hasNextInt()) {
			num1 = sc.nextDouble();
		} else {
			System.err.println("Error - The Value Entered is not a Double Value ");
			System.exit(0);
		}
		
		System.out.print("Enter 2nd Double Value - ");
		if (sc.hasNextDouble() && !sc.hasNextInt()) {
			num2 = sc.nextDouble();
		} else {
			System.err.println("Error - The Value Entered is not a Double Value ");
			System.exit(0);
		}

		double sum = num1 + num2;
		System.out.println("Average = " + (sum / 2));

	}

}
