package operator;

import java.util.Iterator;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 복합대입 연산
		// 산술연산과 대입연산을 같이 수행한다
		
		int num = 0;
		System.out.println("num  :"	+num);
		
		num = num + 1 ; // 현재 num값에 1을 더한 값을 다시 num에 대입한다
						// 산술연산 + 와 대입연산 =이 같이 있다
						// 좌변과 우변에 동일한  변수 num이 있다
						// num의 값이 기존값에 비해 1 늘어나는 식이다
		
		System.out.println("num :" + num);
		
		num += 1;			// 산술연산을 대입연산 앞으로 이동시키고
							// 우변의 num을 생략한다
							// 위에 있는 num = num + 1과 동일한 수식이다

		
		System.out.println("num : " +num);
		
		int binaryNumver = 1;
		
		System.out.println(binaryNumver);
		
		binaryNumver = binaryNumver *2;
		System.out.println(binaryNumver);
		
		binaryNumver *= 2;
		System.out.println(binaryNumver);
		
		binaryNumver *= 2;
		System.out.println(binaryNumver);
		
	
		for (int i = 0; i < 15; i++) {
			binaryNumver *= 2;
			System.out.println(binaryNumver);
		}
		
		
		
		
		
		
		
		
	}

}
