package array;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열을 char배열로 변환 후 선택정렬을 수행하고
		// 다시 문자열로 바꿔서 출력하기
		
		
		String str = "qwertyuiopasdfghklzxcvbnm";
		
		char[] arr = str.toCharArray();
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					char tmp = arr[i];				// 좌변과 우변의 자료형은 같아야 한다
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
//		System.out.println(char[arr]);
		System.out.println(Arrays.toString(arr));
		// [a, b, c, d, e, f, g, h, i, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z]
		System.out.println(arr); // syso에서는 char을 바로 출력이 가능하다
		// abcdefghiklmnopqrstuvwxyz

		
		
		
	}

}
