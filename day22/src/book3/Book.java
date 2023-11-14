package book3;

//책이름		(문자열)
//작가		(문자열)
//가격		(정수)
//출판사		(문자열)


public class Book {
	
	private String name;
	private String author;
	private int price;
	private String publisher;
	
//	출력 서식을 toString으로 오버라이딩
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String data =  String.format(" %s (%s, %s), %,d\n",name,author,publisher,price);
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
