package utility;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a=1,b=2;
		int f=0;
		for(int i=1;i<=5;i++) {
			f=a+b;
			a=b;
			b=f;
			System.out.println(f);
		}

	}

}
