package book4;

	

import java.util.ArrayList;

//	데이터 저장소를 (배열 -> 리스트 -> 파일 -> DB) 를 직접 참조하거나, 연결할 수 있음

//	프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

//	Book[] arr = new Book[26];
	ArrayList<Book> list = new ArrayList<>();

	

	public void showList() {

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) != null) { // 배열의 각 초긱밧 null을 처리(회피)하기 위한 if
				System.out.println(list.get(i));
			} // 객체 내부 값을 가져오기 위한 getter

			for (Book ob : list) {
				System.out.println(ob);
			}
		}

	}

	public int insertBook(Book ob) {
		int row = 0;
		boolean flag = list.add(ob); // 추가 성공시 true
		row = flag ? 1 : 0;
		return row;
	}

	public int deleteBook(String name) {
		int row = 0;
		boolean flag = list.removeIf(ob -> ob.getName().equals(name));
		row = flag ? 1 : 0;

		return row;
	}

}
