package operators;

import java.util.Scanner;

public class RelationalOperators {
	public static void main(String[] args) {
		int age1, age2;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input age1 and age 2: ");
		age1 = scan.nextInt();
		age2 = scan.nextInt();
		
		System.out.println("Age 1 is greater than age 2: "+(age1 > age2));
		System.out.println("Age 1 is lesser than age 2: "+(age1<age2));
		System.out.println("Age 1 is greater than or equal to age 2: "+(age1>=age2));
		System.out.println("Age 1 is less than or equal to age 2: "+(age1<=age2));
		System.out.println("Age 1 is not equal to age 2: "+(age1 != age2));
		System.out.println("Age 1 is equal to age 2: "+(age1 == age2));
	}
}
