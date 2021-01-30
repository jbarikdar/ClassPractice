package utility;

public class SecondHighestNumber {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5, 6 };
		int highest = a[0];
		int sechigh = a[1];
		if (highest < sechigh) {
			highest = a[1];
			sechigh = a[0];
		}
		for (int i = 2; i < a.length; i++) {
			if (a[i] > highest) {
				sechigh = highest;
				highest = a[i];
			} else if (a[i] < highest && a[i] > sechigh) {
				sechigh = a[i];
			}
		}

		System.out.println("Second highest " + sechigh);

	}

}
