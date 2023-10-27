package array;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 정수형 배열을 참조할 수 있는 참조변수를 생성하고 null로 초기화하세요
		int[] arr = null; 
		
//		System.out.println("배열의 길이 :" + arr.length);
		// java.lang.NullPointerException
		// 배열이 참조형 타입
		
		// 배열을 리터럴 형식으로 초기화하는것은 배열 선언시에만 가능하다
//		arr = {1, 2, 3, 4, 5};
		//Array constants can only be used in initializers
		
		int[] arr2 = new int[] { 1, 2, 3, 4, 5 };
		
		arr = new int[]  {1, 2, 3, 4, 5 };
		
		// 배열에는 index가 존재하고, index는 항상 0부터 시작한다
		/*
		 	index [0][1][2][3][4]
		 	arr = {1, 3, 5, 7 ,9 };
		 	
		 	
		 	arr[0] = 1
		 	arr[1] = 3
		 	arr[2] = 5
		 	arr[3] = 7
		 	arr[4] = 9
			 	
		 		 
		 */
		
		System.out.println("arr[0] : " +arr[0]);
		System.out.println("arr[1] : " +arr[1]);
		System.out.println("arr[2] : " +arr[2]);
		System.out.println("arr[3] : " +arr[3]);
		System.out.println("arr[4] : " +arr[4]);
		
		System.out.println();
		
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		System.out.println();
		
		// i번째 칸에 (i + 1) * 10 값을 대입한다
		
		for (int i = 0; i < 5; i++) {
//			System.out.println((i + 1) * 10);
			arr[i] = (i + 1) * 10;
		}
		// 값이 바뀌었는지 다시 확인
		
		for (int i = 0; i < 5; i++) {
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		System.out.println();
		
		
		// 1) arr 배열의 각 값에 5씩 더하세요
		
		for (int i = 0; i < 5; i++) {
			arr[i] += 5;
			
			System.out.printf("arr[%d] : %d\n", i, arr[i]);
		}
		System.out.println();
		
		
		// 2) arr의 각 요소 (element, member) 중에서 3의 배수만 골라서 모두 합친 값을 출력
		// 베열의 길이 : 배열의 전테 크기 / 단일 자료형의 크기
		// 5 = 20  / 4
		int total = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] %  3 == 0) {
				total += arr[i]; // i만 적어주면 인덱스의 값이 출력된다
			}
		}
		System.out.println(total);
		System.out.println();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
