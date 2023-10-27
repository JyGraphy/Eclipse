package array;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 길이가 자동으로 증가하는 배열
		// 1) 자바의 배열은 같은 자료형만 담을 수 있으면, 생성 후에는 길이를 바꿀 수 없다
		// 2) 하지만, 배열은 참조형(Reference Type)이다
		// 3) 원본 배열보다 사이즈가 더 큰 배열을 생성한 다음, 원본 내용을 복사하여 바꿔치기할 수 있다
		// 4) 이 형식을 반복수행하면 길이가 자동으로 증가하는 것과 같은 효과를 볼 수 있다
		
		
		// 0을 입력할때까지 반복하는 코드
		// 참조변수의 특징 디버깅 해볼것
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		int[] tmp;
		
	LOOP :	while (true) {
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] ==0) {
					System.out.println("정수 입력 :");
					arr[i] = sc.nextInt();
					if (arr[i] == 0) {
						break LOOP;
					}
				}
			}
			System.out.println(Arrays.toString(arr)); 	// 현재까지의 배열 출력
			tmp = new int[arr.length + 3];
			for (int i = 0; i < arr.length; i++) {
				tmp[i] = arr[i];
			}
			arr = tmp;
		}
	
	System.out.println(Arrays.toString(arr));
	System.out.println("끝");
	sc.close();
	
	
	
	}
	

}
