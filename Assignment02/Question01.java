import java.util.Scanner;

public class Program01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Any Number - ");
		int number = sc.nextInt();
		System.out.println();
		System.out.println("Given Number = " + number);
		System.out.println("Binary Equivalent = " +Integer.toBinaryString(number));
		System.out.println("Octal Equivalent = " +Integer.toOctalString(number));
		System.out.println("Hexadecimal Equivalent = " +Integer.toHexString(number));

	}

}
