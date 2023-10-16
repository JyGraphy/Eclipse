package input;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 입력과 연산자를 사용한 예시
		
		int num;				// 정수를 입력받을 변수
		boolean isEven;			// 입력받은 정수가 짝수인지 판별할 변수
		
		Scanner sc = new Scanner(System.in);	// 입력을 처리할 변수(객체)
		
		System.out.print("정수를 하나 입력하세요 :");
		
		num = sc.nextInt();			
		isEven = num % 2 == 0;
		
		System.out.printf("%d는 %s입니다\n", num, isEven ? "짝수" : "홀수");
		
		sc.close();
	}

}
