package book6;

import java.util.List;

//	데이터 저장소를 (배열 -> 리스트 -> 파일 -> DB) 를 직접 참조하거나, 연결할 수 있음

//	프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

	public void showList() {
		BookDAO dao = new BookDAO(); // Connection이 연결된 상태
		List<BookDTO> list = dao.selectList();	// DB에 저장된 데이털르 불러온다
		list.forEach(ob -> System.out.println(ob));
	}

	public int insertBook(BookDTO ob) {
		int row = 0;
		BookDAO dao = new BookDAO();
		row = dao.insertBook(ob); // 메인이 넘겨준 객체를 dao로 전달하여 추가한다
									// 추가 결과 정수를 다시 메인으로 반환한다
		
		return row;
	}

	public int deleteBook(String name) {
		int row = 0;
		
		BookDAO dao = new BookDAO();
		row = dao.deleteBook(name);
		
		
		return row;
	}

}
