package operators;

import java.util.Scanner;

public class LogicalOperators {

	public static void main(String[] args) {
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input three numbers: ");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		
		System.out.println("Expression using && (AND) Operator: ");
		
		System.out.println("A is the largest: "+ ((a>b)&&(a>c)));
		System.out.println("B is the largest: "+ ((b>a)&&(b>c)));
		System.out.println("C is the largest: "+ ((c>a)&&(c>b)));
		
		System.out.println("Expression using || (OR) Operator: ");


		System.out.println("A is larger than B or A is larger than C: "+((a>b)||(a>c)));
		System.out.println("B is larger than A or B is larger than C: "+((b>a)||(b>c)));
		System.out.println("C is larger than A or C is larger than B: "+((c>a)||(c>b)));
		
		System.out.println("Expression using ! (NOT) Operator: ");
		
		System.out.println("A is greater than b: "+ !(a>b));
	}
}
