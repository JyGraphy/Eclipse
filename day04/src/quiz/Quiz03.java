package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 서로 다른 세 정수를 입력받은 다음 가장 큰 수를 하나 출력하세요
	/*
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("세 정수를 입력하시오");
		
		System.out.println("정수 1 입력 :");
		int n1 = sc.nextInt(); //2
		System.out.println("정수 2 입력 :");
		int n2 = sc.nextInt(); //3 
		System.out.println("정수 3 입력 :");
		int n3 = sc.nextInt(); //5
		
		int max;
		max = n1;
		
		if (n2 > max) {
			max = n2;
		}
		 if (n3 > max) {
			max = n3;
		}	
		 System.out.printf("가장 큰 수는 %d이다\n", max);
	*/	
	
	/*	
	
		        Scanner sc = new Scanner(System.in);

		        System.out.print("첫 번째 정수 입력: ");
		        int num1 = sc.nextInt();

		        System.out.print("두 번째 정수 입력: ");
		        int num2 = sc.nextInt();

		        System.out.print("세 번째 정수 입력: ");
		        int num3 = sc.nextInt();

		        if (num1 > num2 &&	 num1 > num3) {
		            System.out.println("가장 큰 수는 " + num1 + "입니다.");
		        } else if (num2 > num1 && num2 > num3) {
		            System.out.println("가장 큰 수는 " + num2 + "입니다.");
		        } else {
		            System.out.println("가장 큰 수는 " + num3 + "입니다.");
		        }
		   
	*/
	
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3, max;
		
		System.out.println("n1 입력 :");
		n1 = sc.nextInt();
		
		System.out.println("n2 입력 :");
		n2 = sc.nextInt();
		
		System.out.println("n3 입력 :");
		n3 = sc.nextInt();
		
		if(true) max = n1;				// 값이 없으니 일단 n1을 대입해둔다
		if(max < n2) max = n2;			// 최대값보다 n2가 더 크면 n2를 최대값으로 지정한다
		if(max < n3) max = n3;			// 최대값보다 n3가 더 크면 n3를 최대값으로 지정한다
		
		System.out.println("가장 큰 수 : " + max);
		
		sc.close();
		
		
		
		
	}

}
