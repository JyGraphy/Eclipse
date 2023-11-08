package inheritance;

class Human {
	
	// 이름을 저장할 필드
	String name;
	// 생성자를 이용하여 이름 전달, 필드 작성
	public Human(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	// 본인의 이름을 출력하는 매서드 show() 를 작성
	void show() {
		System.out.printf("저의 이릅은 %s 입니다\n", name);
	}
}


class Student extends Human{
	
	// 학생의 성적 점수를 저장할 int 형 필드 score를 작성
	int score;
	// 생성자에서 이름과 점수 전달, 이름은 슈퍼클래스 생성자, 점수는 필드에 저장
	 Student(String name, int score) {
		 super(name);
		 this.score = score;
		// TODO Auto-generated constructor stub
	}
	// show()를 오버라이딩하여 이름과 점수를 함께 출력
	 @Override
	void show() {
		// TODO Auto-generated method stub
		 System.out.printf("저의 이릅은 %s 이고 점수는 %d 입니다\n", name, score);
	}
}


public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Human ob1 = new Human("이지은");
		Student ob2 = new Student("홍진호", 22);
		ob1.show();
		ob2.show();
		
		
		
		
		
//		상속을 사용하는 경우
//		A 클래스와 B클래스가 is 관계가 성립하면 상속을 사용한다
//		카테고리(범주) 상의 포함관계일 경우에 사용
//		Student is a Human
//		class Student extends Human (o)
		
//		물리적 포함관계는 상속으로 표현하지 않는다 (has)
//		Car has a tire
//		class Tire extrnds Car(x)
		
		
//		같은 상황에서 서로 다른 클래스의 객체를 사용할 수 있는지 확인해보면 된다
//		학생에게 말을 걸었다 -> 사람에게 말을 걸었다 (o)
//		자동차를 운전한다 -> 타이어를 운전한다 (x)
		
		
//		[일반DB접속클래스]를 이용하여 DB에 접속 -> [오라클 DB접속클래스]를 이용하여 DB에 접속
		
		
	}

}
