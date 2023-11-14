package book5;

import java.util.Scanner;

public class Main {

//	도서 이름을 전달받아서 일치하는 객체를 찾아서 삭제하는 함수

//	case2의 입력부분, Scanner를 매개변수로 전달받아서 객체를 생성하고, 그 객체를 반환하는 함수
//	사용자 입력값으로 객체를 구성하여 그 객체를 반환하는 함수

	static Book getBookFromUsetInput(Scanner sc) {
		Book book = new Book();
		String name, author, publisher;
		int price;

		System.out.println("책 이름 을 입력하시오 :");
		name = sc.nextLine();

		System.out.println("작가 이름 입력 : ");
		author = sc.nextLine();

		System.out.println("출판사를 입력 : ");
		publisher = sc.nextLine();

		System.out.println("가격을 입력 :");
		price = Integer.parseInt(sc.nextLine());

		book.setAuthor(author);
		book.setName(name);
		book.setPublisher(publisher);
		book.setPrice(price);

		return book;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Book 클래스의 피드값을 입력받거나 출력을 위해
//		지역변수를 만들어두는 편이 좋다
		Handler handler = new Handler();
		Book book = null; // 추가 수정 삭제 검색에서 사용할 객체를 받기 위한 함수
		Scanner sc = new Scanner(System.in);
		String name;
		int row; // 추가 및 삭제가 정상적으로 수행되었는지 확인하기 위한 변수

		// 배열은 자료형에 맞는 0값으로 초기화
		// 참조형 변수(클래스 타입 변수)의 초기값은 null
		int menu; // swutch와 연동하기 위한 메뉴

		// Book의 타입 필드 (정보 입력 받기 위한 값)

//					같이 묶어서 생각
//		입력 및 출력 ( [자료형 + 대입] , 제어문 + 연산자 활용)
		handler.load();
		MAIN: while (true) {

			// 입력

			System.out.println("1. 추가");
			System.out.println("2. 목록");
			System.out.println("3. 삭제");
			System.out.println("0. 종료");

			System.out.println("메뉴를 입력하세요 >>>");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) { // 사용자가 입력한 메뉴에 따라서 서로 다른 코드를 수행한다 (분기문)

			case 1: // 1 추가
				book = getBookFromUsetInput(sc); // scanner로 값을 받아야기 떄문에 삭제하기 않고 유지한다
													// 또한 화면의 기능이기 때문에 삭제하지 않는다
				row = handler.insertBook(book);
				System.out.println(row != 0 ? "추가 성공" : "추가 실패");
				break; // 추가한 후 break가 없으면 case0으로 넘어가기 위한 방지

			// 출력
			case 2: // 2 목록
				handler.showList();
				break;

			case 3:
				// 배열 내부의 도서 중에서 이름이 일치하는 객체를 찾아서 제거
				System.out.println("검색어를 입력하세요 :");
				name = sc.nextLine();

				row = handler.deleteBook(name);
				System.out.println(row != 0 ? "삭제 성공" : "삭제 실패");
				break;
				
			
				

			case 0: // 종료
				handler.save(); // 종료를 눌러야 엑셀 파일에 정보가 기록된다

				break MAIN;
			}
	
		}

sc.close();
System.out.println("프로그램 종료");

} // end of main

} // end of class Main
