package book;

import java.util.Scanner;

public class Main {

	// 사용자와 상호작용(입출력)
	// 입력값에 따라서 handler의 함수를 호출

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Handler handler = new Handler();
		Scanner sc = new Scanner(System.in);

		LOOP: while (true) {
			System.out.println("목록을 선택하시오 ");
			System.out.println("1. 도서 추가 ");
			System.out.println("2. 도서 출력 ");
			System.out.println("3. 프로그램 종료 ");
			System.out.println("선택 >>>>>>>>>");

			int meun = Integer.parseInt(sc.nextLine());

			switch (meun) {
			case 1:
				handler.add(sc);
				break;

			case 2:
				handler.printBook();
				break;

			case 3:
				break LOOP;

			default:
				System.out.println("정확한 도서 정보를 입력해주세요 ");
				break;
			}
		}
		sc.close();
		System.out.println("프로그램 종료");

	}

}
