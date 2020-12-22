package Calculator;

import java.util.Scanner;

import Calculator_Operations.AddOperation;
import Calculator_Operations.DivideOperation;
import Calculator_Operations.MultiplyOperation;
import Calculator_Operations.SubstractOperation;

public class InteractiveCalculator {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Please, enter 1st number: ");
		int input1 = scanner.nextInt();
		
		System.out.print("Please, enter 2nd number: ");
		int input2 = scanner.nextInt();
		
		System.out.print("Please, make a choice for operation as follows:-\n"+
			 "			'A/a' for add operation: \n" +
			 "			'S/s' for add operation: \n" +
			 "			'D/d' for add operation: \n" +
			 "			'M/m' for add operation: \n" + 
			 "			'All' to carry all operation: " 			
				);
		scanner.nextLine();
		
		String operation = scanner.nextLine();

		int result = 0; 
		int result1 =0;
		int result2 =0; 
		int result3 =0;
		int result4 = 0;
		 
		if (operation.equals("a") ||operation.equals("A")) {
			AddOperation add = new AddOperation();
			add.setA(input1);
			add.setB(input2);
			result = add.getResult();
			
			System.out.println("The request Add operation result is: " + result);
		}
		else if(operation.equals("S") ||operation.equals("s")) {
			SubstractOperation sub = new SubstractOperation();
			sub.setA(input1);
			sub.setB(input2);
			result = sub.getResult();
			
			System.out.println("The request Substraction operation result is: " + result);
		}
		else if(operation.equals("M") ||operation.equals("m")) {
			MultiplyOperation mult = new MultiplyOperation();
			mult.setA(input1);
			mult.setB(input2);
			result = mult.getResult();
			
			System.out.println("The request Multiply operation result is: " + result);
		}
		else if(operation.equals("d") ||operation.equals("D")) {
			DivideOperation div = new DivideOperation();
			div.setA(input1);
			div.setB(input2);
			result = div.getResult();
			
			System.out.println("The request Divide operation result is: " + result);
		}
		else if (operation.equals("All") || operation.equals("all")) {
			SubstractOperation add = new SubstractOperation();
			add.setA(input1);
			add.setB(input2);
			result1 = add.getResult();
			
			SubstractOperation sub = new SubstractOperation();
			sub.setA(input1);
			sub.setB(input2);
			result1 = add.getResult();
			
			SubstractOperation mult = new SubstractOperation();
			mult.setA(input1);
			mult.setB(input2);
			result1 = add.getResult();
			
			SubstractOperation div = new SubstractOperation();
			div.setA(input1);
			div.setB(input2);
			result1 = add.getResult();
			
			System.out.println("Result for each operation for given inputs are: \n" +
							   "Add: " + result1 + 
							    "\nSubstract: " + result2 +
							    "\nMultiply: " + result3 +
							    "\nDivide: " + result4);
			
		}
		
		else {
			System.out.println("Sorry, didn't understand/ wrong operation request");
		}

	}

}
