package utility;

public class Swap2Number {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("a is "+a+" b is "+b);
	}

}
