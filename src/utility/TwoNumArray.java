package utility;

public class TwoNumArray {

	public static void main(String[] args) {
		int a[] = { 100, 200, 300, 400, 500,600,700,800,900};
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] + a[j] == 500) {
					System.out.println(a[i] + " + " + a[j]);
				}
			}
		}

	}

}
