package array;

import java.util.Arrays;
import java.util.Iterator;

public class Quiz01 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {9, 54, 23, 72, 99, 85, 31, 16, 49, 62 };
		
		// 1) arr에서 홀수의 개수와 짝수의 개수를 각가 변수에 담아서 출력하세요
		
		int n1 = 0, n2 = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				n1 +=1;
			}
			else {
				n2 += 1;
			}
		}
		System.out.println("홀수의 개수 : " +n2);
		System.out.println("짝수의 개수 : " +n1);
	
		
		// 2) arr에서 홀수만 골라서 합계를 구한다음 출력하세요
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				sum += arr[i];
			}
		}
		System.out.println("홀수 전체의 합계는 : " +sum);
		System.out.println();
		
		
		
		// 3) arr에서 짝수만 골라서 새로운 배열 arr2에 저장하고 출력하세요
		// [] : 배열 생성시에는 길이를 지정한다 (리터럴 및 변수 사용 가능)
		//		생성된 배열에 대해 사용하면 길이가 아니라, index를 지정한다
		
		// 원본 배열의 길이느 10이고, 새로운 배열의 길이는 4이다
		// 길이가 서로 다르기 때문에, 원본 배열의 index와 신규배열의 index를 따로 관리해야한다
		int[] arr2 = new int [n1];
		int c = 0;
		for (int i = 0; i < arr.length; i++) {
			
				if (arr[i] % 2 == 0) {
					
						arr2[c] = arr[i];
						c++;
					
			}
//				for (int j = 0; j < c; j++) {
//					System.out.println();
//				}
				
				
			}
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		
		// 4) arr의 내용을 거꾸로 담은 배열 arr3을 만들어서 출력하세요
		int [] arr3 = new int [arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			arr3[i] = arr[arr.length -1 -i]; 
				
			
		}
		System.out.println(Arrays.toString(arr3));
		System.out.println();
		
		
		// 5) arr를 내름차순 정렬한 후 다시 출력하세요
		
		int t = arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i +1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					t = arr[i];
					arr[i] = arr[j];
					arr[j] = t;
					
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
	}

}
