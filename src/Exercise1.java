import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter some text:");
		String inputString = input.nextLine();
		System.out.print(inputString);
		input.close();
	}

}
