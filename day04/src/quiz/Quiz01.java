package quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 정수를 입력받아서 더 큰수를 화면에 출력하세요
/*
		Scanner sc = new Scanner(System.in);

		int num1, num2;

		System.out.println("두 정수를 입력하시오");

		System.out.printf("1 번 정수 입력 : \n");
		num1 = sc.nextInt();

		System.out.print("2 번 정수 입력 : \n");
		num2 = sc.nextInt();

		if (num1 > num2) {
			System.out.printf("1번 정수가 더 큽니다 (1번 정수의 값 :%d)\n", num1);
		} else if (num1 < num2) {
			System.out.printf("2번 정수가 더 큽니다  (2번 정수의 값 : %d)\n", num2);
		} else {
			System.out.printf("두 정수의 값이 같습니다.\n (1번 정수의 값 : %d), (2번 정수의 값 : %d)\n", num1, num2);
		}
		sc.close();
*/
		// cht gpt

		/*
		 * import java.util.Scanner;
		 * 
		 * public class Main { public static void main(String[] args) { Scanner sc = new
		 * Scanner(System.in); System.out.println("두 정수를 입력하시오"); int num1 =
		 * sc.nextInt(); int num2 = sc.nextInt();
		 * 
		 * if (num1 > num2) { System.out.printf("1번 정수가 더 큽니다 (1번 정수의 값 : %d)\n", num1);
		 * } else if (num1 < num2) {
		 * System.out.printf("2번 정수가 더 큽니다  (2번 정수의 값 : %d)\n", num2); } else {
		 * System.out.printf("두 정수의 값이 같습니다. (1번 정수의 값 : %d), (2번 정수의 값 : %d)\n", num1,
		 * num2); } } }
		 * sc.close()
		 */
		
		
		Scanner sc = new Scanner(System.in);
		int n1, n2;
		
		System.out.print("n1 입력 :");
		n1 = sc.nextInt();
		
		System.out.print("n2 입력 :");
		n2 = sc.nextInt();
		
		
		if (n1 > n2) {
			System.out.println("더 큰 수 :" + n1);
		}
		else {
			System.out.println("더 큰 수 :" + n2);
		}
		sc.close();
		
		
		
		
		
		
		
		
		
		

	}

}
