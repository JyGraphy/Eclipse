package accessModifier;

// static : 하나의 클래스에 의해 만들어진 객체들은 모두 같은 값을 공유하게 하는 속성

class Test4 {
	
	int n1 = 10;				// 일반 멤버 필드, 객체마다 다른값을 가지고 변경가능
	static int n2 = 20;			// 정적 멤버 필드, 모든객체가 값을 공유하고 변경 불가능  static 클래식 고정
	final int n3 = 30;			// 불변 멤버 필드, 객체마다 다른 값을 가지고 변경 가능
	static final int N4 = 40;	// 정적 불변 필드, 모든 객체가 값를 공유하고 변경할 수 없다
	
//	클래스를 제외한 모든 요소는 첫글자를 소문자로 작성하지만
//	static final 필드는 예외적으로 모든 굴자를 대문자로 작성한다
//	단어와 단어의 합성인 경우는 각 단어를 구분하기 위한 방법으로_(언더바)를 사용한다
	
	// 필드가 static이면 함수에도 static 작성
	public static int getN2() {		// staitc 메서드는 static 필드를 참조해야 한다
		return n2;					// non -static 필드는 참조할 수 없다
	}								// static는 static 끼리
}									// non-static는 non- static끼리


public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		final만 지정한 필드는 생성자의 활용에 따라 서로 다른 객체가 다른 값을 가질 수도 잇다
//		static final은 변경할 수 없으면, 모든 객체가 동일한 값을 가지게 된다
		
		Test4 ob1 = new Test4();
		Test4 ob2 = new Test4();
		
		System.out.println("ob1 : " + Test4.n2);
		System.out.println("ob2 : " + ob2.n2);
		System.out.println();
//		The static field Test4.n2 should be accessed in a static way
//		정적 필드 n2는 정적인 방식으로 접근해야 한다
//		static 요소는 객제마다 서로 다른값이 아니라, 클래스 하나에 고정된 값이므로
//		[객체.요소] 형식보다는 [클래스.요소} 형식으로 접근한것이 올바르다
		
		Test4.n2 += 5;
		System.out.println("ob1 : " + ob1.n2);  // [객체.요소]
		System.out.println("ob2 : " + ob2.n2);
		System.out.println();
		// 값이 공유된다
		
		System.out.println("Test4.n2 : " + Test4.n2);  // [클래스.요소]
		
		System.out.println(Integer.MAX_VALUE);
//		객체를 생성하지 않아도 접근 할 수 있는 값
		
//		클래스의 구성요소 : 필드, 메서드, 생성자, 접근제한자
//		추가 학급 요소 : getter/setter, static, final
		
//		static 필드를 참조하는 메서드는 static 형식으로 작성하는 것이 좋다
		
		
	}

}
