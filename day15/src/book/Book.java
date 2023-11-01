package book;

public class Book {

	// 단일데이터를 필드와 getter / setter로 구성
	private String name; // 도서명
	private int num; // 책의 넘버링
	private String kind; // 도서 카테고리  
	
	public String getName() {
		return name;
	}
	 public void setName(String name) {
		this.name = name;
	}
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	public String getKind() {
		return kind;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	
	

	

}
