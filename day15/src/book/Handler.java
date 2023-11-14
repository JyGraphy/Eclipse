package book;

import java.util.Scanner;

public class Handler {

	private Book[] arr = new Book[5];
//	private int row = 0;

	public Book add(Scanner sc) {
		Book book = new Book();
		String name, kind;
		int num;
		
		System.out.println("도서명을 입력하시오 : ");
		 name = sc.nextLine();
		
		System.out.println("도서의 종류를 입력하시오 : ");
		kind = sc.nextLine();
		
		System.out.println("도서의 넘버링을 입력하시오 : ");
		num = Integer.parseInt(sc.nextLine());
		
//		for (int row = 0; row < arr.length; row++) {
			
			book.setName(name);
			book.setKind(kind);
			book.setNum(num);
//			arr[row] = book;
		
//		}
	
//		
//		if (row == 0) {
//			System.out.println("도서 추가에 성공했습니다 " );
//		}
//		else {
//			System.out.println("라이브러리에 도서가 가득 찼습니다 ");
//		}
		
		return book;

	}



	public void printBook() {

		System.out.println("도서 정보의 출력 :");

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.printf("%s, (%s) %d\n", 
						arr[i].getName(), arr[i].getKind(), arr[i].getNum());
			}
		}
		
	}

}
