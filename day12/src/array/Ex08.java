package array;

import java.util.Arrays;
import java.util.Random;

public class Ex08 {
	
	static void selectionSort(int [] arr) {
		for (int i = 0; i < arr.length -1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]> arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
	}
	
	
	static void plus(int num) {
		num +=1;
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 5;
		System.out.println("n1 :" + n1);
		plus(n1);
		System.out.println("n1 :" + n1);
	
		Random ran = new Random();
		int[] arr = new int[1000000];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(arr.length);
		}
		System.out.println(Arrays.toString(arr));
		
		long start = System.currentTimeMillis();
		selectionSort(arr);
		long end = System.currentTimeMillis();
		
		System.out.println(Arrays.toString(arr));
		System.out.printf("%.2f sec\n", (end - start) / 1000.0);
		
		
	}

}
