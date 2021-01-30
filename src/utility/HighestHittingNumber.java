package utility;

public class HighestHittingNumber {
	public static void main(String[] args) {
		//Highest number repeating in array
		int a[] = { 3, 2, 4, 3, 6, 3, 4, 9, 9, 9, 9 };
		int maxHit = 0;
		int currHit = 1;
		int index = a[0];
		//Comparing 
		for (int i = 0; i <= a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					currHit++; //Counter added if similar
				}
			}
			if (currHit > maxHit) {
				maxHit = currHit; //Counter
				index = a[i]; //Which number is being repeated 
			}
			currHit = 1;//Reinitializing 
		}
		System.out.println("hitting number " + index + " occured " + maxHit + " times");
	}

}
