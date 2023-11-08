package inheritance;

class Car{
	int speed;
	int min;
	int max;
	int perTic = 5;
	
	public Car() {
		// TODO Auto-generated constructor stub
		this.min = 30;
		this.max = 50;
	}
	
	void drive( ) {
		System.out.println("출발");
		speed = min;
		while (speed != max) {
			System.out.println("현재 속도 : "+ speed);
			speed += perTic;
		}
		
		while (speed >= 0) {
			System.out.println("현재 속도 : "+ speed);
			speed -= perTic;
		}
		System.out.println("정지 !! \n");
	}
}

//	Car를 상속 받는 RaceCar 클래스 작성
//	생성자에서 min, max, perTic을 전달받도록 처리

class RaceCar extends Car{
	public RaceCar(int min, int max, int perTic) {
		// TODO Auto-generated constructor stub
		this.min = min;
		this.max = max;
		this.perTic = perTic;
		
//		super.max; 사용 가능 * static로 걸지 않아서 참조 가능 / this.setMax(max)도 가능
	}
	void drive() {
		// TODO Auto-generated method stub
		super.drive();
	}
}



public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car ob1 = new Car();
		ob1.drive();
		
		
		RaceCar ob2 = new RaceCar(80, 100, 10);
		ob2.drive();
		
//		내가 만득적 없는 메서드가 호출된다
//		슈포클래스를 지정하지 않아도, 자동으로 상속되는 클래스가 있다
//		자바 모든 클래스의 최상위 클래스 : Object 클래스
		System.out.println(ob1.getClass().getSimpleName());
	}

//	자바의 상속은 단일 상속만 가능하다 (다중 상속 불가능) 
//	자바의 서브클래스는 오직 하나의 슈퍼클래스만 가진다
//	단, 슈퍼클래스가 또다른 슈퍼클래스를 가지면 연이어 상속받는다
//	다중상속은 인터페이스만 가능
	
	
	
}
