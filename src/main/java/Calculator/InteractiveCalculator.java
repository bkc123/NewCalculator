package Calculator;

import java.util.Scanner;

public class InteractiveCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please, enter 1st number: ");
		int input = scanner.nextInt();
		System.out.print("Please, enter 2nd number: ");
		int input2 = scanner.nextInt();
		System.out.print("Please, choose your operation: ");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		
		
		
		System.out.println(input);
	}

}
