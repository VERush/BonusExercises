
import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		String cont = "y";

		do {
			System.out.println("Hello World");
			System.out.println("Would you like to continue (y/n)? ");
			cont = scan.nextLine();

		} while (cont.equalsIgnoreCase("y"));

		scan.close();

	}

}