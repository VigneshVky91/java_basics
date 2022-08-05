package tasks;

import java.util.Scanner;

public class AreaOfTriangle {
	public static void main(String[] args) {
		double breadth, height, area;
		Scanner scan = new Scanner(System.in);
		System.out.println("Input breadth and height:");
		breadth = scan.nextDouble();
		height = scan.nextDouble();
		
		area = 0.5*(breadth * height);
		System.out.println("Area of Trangle = "+area);
	}
}
