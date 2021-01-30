package utility;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class CopyArray {
	//Copying Array

	public int [] copyArray(int[] arr) {
		int [] err = new int[arr.length];
		for(int i=0;i<arr.length; i++) {
			err[i]=arr[i];
		}
		return err;
	}
	
	public void getMaxNum(int[] a) {
		//int[] a = {5,9,7,4};
		int max=a[0];
		for(int k=1;k<a.length;k++) {
			if(a[k]> max) {
				max=a[k];
			}
		}
		System.out.println("Maxinum num is: "+max);
	}
	@Test
	public void test1() {
		int[] a = {5,9,7,3};
		//Sort in Ascending
		Arrays.sort(a);
		//Sort descending by using for loop
		for(int j=a.length-1;j>=0;j--) {
			System.out.println(a[j]);
		}
		int r[]=copyArray(a);
		for(int x:r) {
			System.out.println(x);
		}
		getMaxNum(a);
	}
}
