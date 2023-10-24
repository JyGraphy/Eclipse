package string;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 16자리의 카드번호를 문자열로 입력받아서
		 * 카드번호의 오른쪽끝에서 부터 세어서 			==> index를 기준으로
		 * 홀수번째는 그대로 두고
		 * 짝수번쨰는 2를 곱한다
		 * 만약 2를 곱한 숫자가 두자리수이면
		 * 각 자리수를 더해서 한자리 수로 만든다
		 * 이렇게 만들어진 16개의 한자리 숫자를 모두 더하여
		 * 그 합이 10으로 나누어 떨어지면 유효한 카드번호
		 * 그렇지 않으면 유효하지 않은 카드번호이다
		 * (Luhn 알고리즘)
		 *
		 *카드번호를 입력받아서 유효송을 검증하는 코드를 작성하시오
		 *
		 * replace("-" , "")
		 *
		 *(String, char, int, /, %,+)
		 */
		//		String input = "1162-3434-1010-2113";
		// 1162-3434-1010-2111 = 40 = 유효
		
		// 훌수는 그대로 짝수는 2배
		// 21[12]2-6464-2020-4113
		//2132-6464-2020-4113
		// 42 == 유효하지 않은 번호
		
		
Scanner sc = new Scanner(System.in);
		
		System.out.print("16자리 카드번호를 입력하시오 : ");
		
		String cardNumber = sc.nextLine().replaceAll("-", "");
		// - (하이픈을 제거)
		
		if (cardNumber.length() != 16) {
			System.out.println("유효하지 않은 카드번호");
			
		}
		else {
			int sum = 0;
			for (int i = 0; i < 16; i++) {
				int num = cardNumber.charAt(i) - '0';
				
				if (i % 2 == 0) {
					num *= 2;
					if (num > 9) {
						num = (num % 10) + (num / 10);
					}
				}
				sum += num;
			}
		
			if (sum % 10 == 0) {
				System.out.println("유효한 카드 번호입니다.");
			}
			else {
				System.out.println("유효하지 않은 카드번호 입니다.");
			}
		}
		
	
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
