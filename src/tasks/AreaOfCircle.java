package tasks;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		double radius,pi = 3.14, result;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input radius: ");
		radius = scan.nextDouble();
		
		result = pi * radius * radius;
		
		System.out.println("Result = "+result);
	}
}
