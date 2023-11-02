package accessModifier;

import java.util.Arrays;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1 = 10, n2 = 20;
		boolean flag1 = n1 - n2 > 0; // n1 > n2

		String s1 = "Hello", s2 = "World";
		boolean flag2 = s1.compareTo(s2) > 0; // s1 > s2

		System.out.println("n1이 n2보다 크다 : " + flag1);
		System.out.println("s1이 s2보다 크다 : " + flag2);

		System.out.println("n1이 n2보다 작다 : " + !flag1);
		System.out.println("s1이 s2보다 작다 : " + !flag1);

//		String클래스의 compareTo(String anotherString)은
//		두개의 문자열의 글자의 코드값을 비교하여 정수로 반환한다

		Integer [] arr = { 50, 30, 20, 40, 10 };
		String[] arr2 = { "원빈", "현빈", "우빈", "준빈", "다빈" };

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println();

//		sortIntArray(arr);
		sortIntArray(arr2);

		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
//		arr배열을 정렬한다. 내부 요소를 a와 b라고 할때, b에서 a를 뺀 결과가 정수이다
//		정수가 0보다 크면 바꿔라
		Arrays.sort(arr, (a, b) -> a - b );			// int는 클래스가 아니라서, Integer로 변경
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr2, (a,b) -> a.compareTo(b));
		System.out.println(Arrays.toString(arr2));
		
		
	}

	// 정수배열을 오름차순으로 정렬하는 함수 sortIntArray(int[] arr)
	static int[] sortIntArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = 0;
				if (arr[i] > arr[j]) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}

		return arr;
	}

	static String[] sortIntArray(String[] arr2) {
//		Arrays.sort(arr2);
		int n = arr2.length;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < i; j++) {
				if (arr2[i].compareTo(arr2[j]) > 0) {
					String tmp1 = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = tmp1;
				}
			}

		}
		return arr2;

	}
	// 문자열배열을 오름차순으로 정렬하는 함수 sortStringArray(String[] arr)
}
