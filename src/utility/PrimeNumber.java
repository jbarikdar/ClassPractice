package utility;

public class PrimeNumber {
	public static void main(String[] args) {
		//Check a range of numbers
		int num =0;
		for(int j=1;j<=100;j++) {
			num=j;	
		boolean flag = false;
		for(int i=2;i<num;i++) {
			if(num%i==0) {
				//System.out.println(num+" is not prime number");
				flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println(num+" is prime num");
		}
	}
	}
}
