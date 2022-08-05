package tasks;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		double length, breadth, area;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input length and breadth: ");
		length = scan.nextDouble();
		breadth = scan.nextDouble();
		
		area = length * breadth;
		
		System.out.println("Area of rectangle = "+area);
	}
}
