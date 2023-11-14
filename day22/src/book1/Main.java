package book1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Book 클래스의 피드값을 입력받거나 출력을 위해
//		지역변수를 만들어두는 편이 좋다
		
		Scanner sc = new Scanner(System.in);
		Book[] arr = new Book[26];	// BOOK의 객체를 저장하기 위한 배열
						// 배열은 자료형에 맞는 0값으로 초기화
						// 참조형 변수(클래스 타입 변수)의 초기값은 null
		int menu;		// swutch와 연동하기 위한 메뉴
		String name, author, publisher;
		int price;
		// Book의 타입 필드 (정보 입력 받기 위한 값)
		
		
//					같이 묶어서 생각
//		입력 및 출력 ( [자료형 + 대입] , 제어문 + 연산자 활용)
	MAIN :	while (true) {
			
			//입력
			
			System.out.println("1. 추가");
			System.out.println("2. 목록");
			System.out.println("0. 종료");
			
			System.out.println("메뉴를 입력하세요 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) { // 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다 (분기문)
			
			case 1:  		// 1 추가
				
				System.out.println("책 이름 을 입력하시오 :");
				name = sc.nextLine();
				
				System.out.println("작가 이름 입력 : ");
				author = sc.nextLine();
				
				System.out.println("출판사를 입력 : ");
				publisher = sc.nextLine();
				
				System.out.println("가격을 입력 :");
				price = Integer.parseInt(sc.nextLine());
				
				// 4개의 값을 하나의 값으로 구성하기 위해 생성자를 호출
//					배열의 칸 중에서 빈칸을 하나 찾아서 그곳에 객체 생성후 4개의 값을 저장
//					다음 칸에도 똑같은 값을 넣으면 아노디기 떄문에 break를 수행
				for (int i = 0; i < arr.length; i++) {	// 배열의 길이 만큼 순회
					if (arr[i] == null) {
						arr[i] = new Book();		// i번째 index를 4개의 변수 박스로 만드는 과정
						arr[i].name = name;			// 외부 클래스에서 작성시 arr[i]는 this이다
						arr[i].author = author;
						arr[i].publisher = publisher;
						arr[i].price = price;
						break;						// 덮어쓰기 방지 하기 위한 break
					}
				}
				break;							// 추가한 후 break가 없으면 case0으로 넘어가기 위한 방지
				
				// 출력
			case 2:			// 2 목록
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {	// 배열의 각 초긱밧 null을 처리(회피)하기 위한 if
						System.out.printf(" %s (%s, %s), %,d\n", 
								arr[i].name, arr[i].author, arr[i].publisher, arr[i].price);
					}
				}

				break;
				
			case 0: 			// 종료
				break MAIN;
			}
			
			
		}
		sc.close();
		System.out.println("프로그램 종료");
		
	} // end of main

} // end of class Main
