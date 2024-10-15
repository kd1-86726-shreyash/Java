import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1 = 0;
		double num2 = 0;

		System.out.print("Enter Any Double Values - ");
		if (sc.hasNextDouble()) {
			if (!sc.hasNextInt()) {
				num1 = sc.nextDouble();
				num2 = sc.nextDouble();

				double sum = num1 + num2;
				System.out.println("Average = " + (sum / 2));
			} else {
				System.err.println("Error - The Value Entered is not a Double Value ");
				System.exit(0);
			}
		} else {
			System.err.println("Error - The Value Entered is not a Double Value ");
			System.exit(0);
		}

	}

}
