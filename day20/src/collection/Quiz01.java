package collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Book implements Comparable<Book> {
	String name;
	int price;
	
	public Book(String name, int price) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%s : %d,원", name, price);
	}
	
	@Override
	public int compareTo(Book other) {
		// TODO Auto-generated method stub
		return this.price - other.price;
	}
}



public class Quiz01 {

	static void showList(List<Book> list) {
		// TODO Auto-generated method stub
		
		for (Book b : list) {
//			System.out.printf("%s : %,d원\n ", b.name, b.price);
			System.out.println(b);
		}
		System.out.println();
		
	}
	
	
	public static void main(String[] args) {
		Book[] arr = {
				new Book("전지적 푸바오 시점", 19800),
				new Book("더 마인드", 17820),
				new Book("트렌드 코리아 2024", 17100),
				new Book("김대리의 데일리 뜨개", 18900),
				new Book("퓨처 셀프", 17820)
	
		};
		
		List<Book> list = Arrays.asList(arr);
		showList(list);
		System.out.println();
		
		list.sort((o1, o2) -> o1.name.compareTo(o2.name));
		for (int i = 0; i < list.size(); i++) {
			Book ob = list.get(i);
			System.out.printf("%s : %,d원\n", ob.name, ob.price);
		}
		System.out.println();
		
		list.sort((b1, b2) -> b2.price - b1.price);
		
//		Book 클래스는 기본비교함수가 내장되어 있지 않기 때문에 예외 발생
		list.sort(null);
//		기본비교함수를 넣어주려면 인터페이스 Compaerable을 구현하면 된다
//		Comparable<T> : 클래스에서 implements 해서 사용하는 인터페이스
//		class Book implements Comparable{ 비교 가능한 도서	(compareTo를 오버라이딩한다)}
		
		
//		Comparator<T> : 람다식으로 객체를 생성하여 전달할 때 사용한다
//		비교함수가 없거나, 자신만의 기준으로 비교하고 싶을떄 문들어서 전달한다
		
		showList(list);
		
	}
	
}
