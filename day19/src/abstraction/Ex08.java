package abstraction;


abstract class Loop { // 추상 클래스는 단일 상속만 가능
	abstract void loop(); // 추상 메서드 (상속받는 서브클래스가 구현해야함)

	void info() { // 일반 메서드 (오버라이딩이 강제되자 않음. 구현안해도 됨)
		System.out.println("반복을 수행하는 클래스");
	}
}

class NumberLoop extends Loop implements Runnable { // 정수를 반복해서 출력하는 클래스 NumberLoop

	@Override
	void loop() {
		for (int i = 0; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	@Override
	public void run() {
		loop();
	}

}

class AlphaberLoop extends Thread { // 다중 실행이 가능한 클래스 AlphabetLoop
	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.print(ch + " ");
		}
		System.out.println();
	}
}

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		NumberLoop ob1 = new NumberLoop();
		AlphaberLoop ob2 = new AlphaberLoop(); // Thread :run() 대신 start()로 호출하면 다중 호출 가능
		
		Thread th = new Thread(ob1);	// Runnable 객체를 Thread 생성자에 넣으면
										// Thread 클래스의 객체와 동일하게 사용할 수 있다.
		
		
//		ob1.loop();
//		ob2.run();

		ob2.start(); // 다중실행 요소를 먼저 호출해두면 함수가 종료되지 않아도 다음 함수를 호출
		ob1.loop(); // ob1에서도 다중실행이 가능한 특성을 추가로 부여하고 싶다면
					// Thread 클래스를 상속 받으면 된다
					// NumberLoop는 이미 Loop라는 슈퍼클래스가 있다
					// 자바에스는 클래스의 다중상속을 허용하지 않는다
		
		th.start();					
		ob2.start();
		
//		1) 서로 다른 클래스(부모클래스가 다르더라도)를 하나의 자료형으로 묶을 수 있다
//		2) 클래스 작성시 추가적인 특성을 자유롭게 부여할 수 있다
		
//		자주 사용한는 인터페이스 중에는 이름이 able로 끝나는 경우가 많다
//		Runnable : 다중실행이 가능한
//		Serializable : 데이털르 직렬화 할 수 있는 (직렬화 하면 파일 저장 및 네트워크 전송이 가능해진다)
//		Comparable<T> : 배열 및 리스트 정렬시 기준을 제시하지 않아도 기본값으로 정렬을 수행할 수 있다
		
		
		
//		list, Set, Map -> 인터페이스
//		이 경우는 특성부여보다. 서로 다른 여러 유형의 클래스를 같은 형식으로 묶기 위한 성격이 크다
//		List를 구현하는 클래스 : Arraylist, LinkedList<E>, Stack, Queue, Vector
		
		
		
		
		
		
	}

}
