package collection;

import java.lang.reflect.GenericArrayType;
import java.util.ArrayList;


class Test2 {
	private String id;
	private String name;
	
	public Test2(String id, String name) {			// (저장) 우클릭 - s, o
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
	}
	
	
	public String getId() {				// (저장) 우클릭 - s, r = alt +a, r
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}




public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		배열에서는 같은 자료형의 데이터만 묶을 수 있기 때문에 자료형을 명시한다
		int[] arr = { 4, 8, 2, 7, 6};
		
//		리스트를 비롯한 컬렉션은 자료형을 명시하지 않으면, Object 타입으로 취급한다
//		따라서 모든 값을 넣을 수 있다
//		이는 장점으로 보일 수도 있으나, 객체를 저장할 경우 메서드를 호출할 수 없는 문제가 발생한다
//		따라서, 특정 자료형만 관리하는 컬렉션을 생성하기 위해 내부 자료형을 명시해야한다
//		GenericType 을 지정하면 컬렉션 내부의 일반적인 자료형이 무엇인지 명시할 수 있다

		Test2[] arr2 = { 
				new Test2("iu930516", "이지은"),
				new Test2("yellow", "홍진호"),
				new Test2("danbi", "나단비"),
				
		
		};
		
		System.out.println(arr2[1].getName());
		
		
//		제네릭 타입을 지정하지 않았을 떄
		ArrayList list1 =new ArrayList();
//		ArrayList is a raw type. References to generic type ArrayList<E> should be parameterized
		list1.add(arr2[0]);
		list1.add(arr2[1]);
		list1.add(arr2[2]);
		
		
//		다운캐스팅 + ()연산을 수행해야 원래 메서드에 접근할 수 있다
		System.out.println(((Test2) list1.get(1)).getName());
		
//		list1.add(int index, E e)
//		list1.add(E e)
//		E는 생성 시 제네릭 타입을 가리킨다
		
		ArrayList<Test2> list2 = new ArrayList<>();
		list2.add(arr2[0]);
		list2.add(arr2[1]);
		list2.add(arr2[2]);
		
		System.out.println(list2.get(2).getName());
		
		
		
//		내부에 String 타입의 값만 저장할 수 있는 리스트
		ArrayList<String> list = new ArrayList<>();
		//list.add(10);		// 정수 및 실수는 추사할 수 없고, String 타입의 데이터만 추가할 수 있다
//		The method add(int, String) in the type ArrayList<String> is not applicable for the arguments (int)
		
		
		list.add("11월 10일");
		list.add("집가서 쉬고 싶다");
		System.out.println(list);
		
		
		
	}

}
