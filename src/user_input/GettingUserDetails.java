package user_input;

import java.util.Scanner;

public class GettingUserDetails {
	public static void main(String[] args) {
		Integer eId;
		String eName;
		double salary;
		char grade;
		boolean qualified ;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Employee id:");
		eId = scan.nextInt();
		
		System.out.println("Enter Employee Name:");
		eName = scan.next();
		
		System.out.println("Enter your salary:");
		salary = scan.nextDouble();
		
		System.out.println("Enter Employee Grade:");
		grade = scan.next().charAt(0);
		
		System.out.println("Whether qualified for promotion true/false");
		qualified = scan.nextBoolean();
		
		
		System.out.println("Employee id = "+eId);
		System.out.println("Employee Name = "+eName);
		System.out.println("Salary = "+salary);
		System.out.println("Grade = "+grade);
		System.out.println("Whether qualified = "+qualified);
	}
}
