package operators;

public class TernaryOperator {
	public static void main(String[] args) {
//		(expression)?T:F;
		int a=5000,b=2000, c=300;
		
//		int greatest = (a>b)?a:b;
//		System.out.println(greatest+" is the greatest");
		
		int greatest = (a>b)?((a>c)?a:c):((b>c)?b:c);
		System.out.println(greatest+" is the greatest among three");
	}
}
