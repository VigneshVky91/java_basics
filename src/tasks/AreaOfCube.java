package tasks;

import java.util.Scanner;

public class AreaOfCube {
	public static void main(String[] args) {
		double area;
		double a;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input a");
		
		a = scan.nextDouble();
		
		area = 6*a*a;
		
		System.out.println("Area of Cube: "+area);
		
	}
}
