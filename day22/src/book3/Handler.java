package book3;

//	데이터 저장소를 (배열 -> 리스트 -> 파일 -> DB) 를 직접 참조하거나, 연결할 수 있음

//	프로그램의 주요 기능(목록/추가/삭제 등)을 모아둔 클래스

public class Handler {

	Book[] arr = new Book[26];

 public	void showList() {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) { // 배열의 각 초긱밧 null을 처리(회피)하기 위한 if
				System.out.println(arr[i]);
			} // 객체 내부 값을 가져오기 위한 getter
		}

	}
 
 public int insertBook(Book ob) {
	 int row = 0;
	 
	 for (int i = 0; i < arr.length; i++) { // 배열의 길이 만큼 순회
			if (arr[i] == null) {
				arr[i] = ob;
				break; // 덮어쓰기 방지 하기 위한 break
			}
		}
	 return row;
 }
 
 public int deleteBook(String name) {
		int row = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null && arr[i].getName().equals(name)) {
				// . NullPointerException 회피하기 위해 arr[i] != null을 사용
				arr[i] = null; // 참조변수가 객체를 참조하지 않도록 한다
								// 모두에게서 잊혀진 참조변수는 소멸한다
				row = 1; // 삭제했다는 결과를 반환하기 위해 row값을 1로 설정한다
				break; // 하나 지웠으면 중단한다
			}
		}
		return row;
	}

 
 
 
 }
