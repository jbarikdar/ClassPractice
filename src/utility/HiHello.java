package utility;

public class HiHello {

	public static void main(String[] args) {
		//Max condition first
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+" hihello");
			}else if(i%3==0) {
				System.out.println(i+" hi");
			}else if(i%5==0) {
				System.out.println(i+" hello");
			}
		}

	}

}
