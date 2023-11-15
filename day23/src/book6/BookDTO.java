package book6;

//책이름		(문자열)
//작가		(문자열)
//가격		(정수)
//출판사		(문자열)

//create table book (
//	    name        varchar2(100),
//	    author      VARCHAR2(100),
//	    publisher   VARCHAR2(100),
//	    price   NUMBER 
//	    );

// 테이블을 구성하는 컬럼의 내용대로 멤버 필드를 작성한다
// 멤버필드에 private을 적용하고, gertter/setter를 public으로 작성한다
// 생성자 오버로딩이나 toString 오버라이딩은 상관없지만
// 반드시 기본 생성자가 존재하도록 구성해야 한다


public class BookDTO {		// Data Transfer Object (DB <-> Program)
	
	private String name;
	private String author;
	private int price;
	private String publisher;
	
//	출력 서식을 toString으로 오버라이딩
	@Override
	public String toString() {
		String data = String.format("%s (%s, %s) : %,d원", name,author,publisher,price);
		return data;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;	
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	
}
