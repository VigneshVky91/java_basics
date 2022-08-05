package typecasting;

public class TypeCastingDemo {

	public static void main(String[] args) {
		int x = 100;
		//Automatic or implicit type casting
		float y = x;
		
		y = 3.14f;
		//Manual or explicit typecasting
		int z = (int)y;
		
		System.out.println(z);
		long l = 10;
//		x = l;
		
//		System.out.println("Y = "+y);
	}	
}
