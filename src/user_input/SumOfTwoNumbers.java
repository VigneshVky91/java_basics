package user_input;

import java.util.Scanner;

public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int number1, number2, result;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input two numbers: ");
		number1 = s.nextInt();
		number2 = s.nextInt();
		
		int sum = number1+number2;
		System.out.println("Sum = "+sum);
		
		int difference = number1 - number2;
		System.out.println("Difference = "+difference);
		
		int product = number1*number2;
		System.out.println("Product = "+product);
		
		int quotient = number1 / number2;
		System.out.println("Quotient = "+quotient);
		
	}
}
