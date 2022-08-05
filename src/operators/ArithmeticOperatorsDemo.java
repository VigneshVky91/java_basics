package operators;

import java.util.Scanner;

public class ArithmeticOperatorsDemo {

	public static void main(String[] args) {
//		+, -, *, /, %
		int num1, num2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input two number: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println("Arithmetic operation: ");
		
		System.out.println("Sum = "+(num1+num2));
		System.out.println("Difference = "+(num1-num2));
		System.out.println("Product = "+(num1*num2));
		System.out.println("Quotient = "+(num1/num2));
		System.out.println("Remainder = "+(num1%num2));
	}
}
