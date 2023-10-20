package loop;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// for문 기본 연습 문제
		
		// 1) 1에서 10사이 정수의 합계를 구하여 출력하세요
			int n1 = 0;
			
			for (int i = 1; i <= 10; i++) {
				n1 += i;
			}
			System.out.println("합계는" + n1 + "입니다");
		
			System.out.println();
		
		// 2) 11에서 20사이 정수의 합계를 구하여 출력하세요
			n1 = 0;
			for (int i = 11; i <= 20; i++) {
				n1 += i;
			}
			System.out.println("합계는 "+ n1 + "입니다");
			
			System.out.println();
		
		// 3) 5에서 0까지 세로로 출력하세요
			
			for (int i = 5; i >= 0; i--) {
				System.out.println(i);
			}
		
			System.out.println();
	}

}
