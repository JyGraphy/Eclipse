package oop;

class Circle {
	double radius;
	double area;
	double pi = 3.14;			// 필드에 초기값을 지정해두면, 생성자로 덮어쓰지 않는한
								// 모든 객체가 동일한 값을 지니게 된다
	Circle(int radius) {
		this.radius = radius;
		area = this.radius *  this.radius * pi;		// 지역변수, 매개변수부터 참조를 시도
	}
	
	
	Circle(double radius) {							// this가 붙거나 같은 이름이 없으면 멤버 필드를 참조
		this.radius = radius;
		area = (radius * radius) * pi;	
		}
	
	void show( ) {
		String form = "반지름 : %.2f 넓이 : %.2f\n";
		System.out.printf(form, radius, area);
	}
	
	
}

	// 반지름 radius를 전달 받아서 저장하고,
	// 원의 넓이를 구하는 코드를 포함하는 생성자를 작성
	
	// 생성자를 오버로딩하여 정수, 혹은 실수 형태로 전달 받을 수 있도록 처리
	
	// 원의 반지름과 넓이를 각각 출력하는 함수 show() 를 정의

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle ob1 = new Circle(2);
		Circle ob2 = new Circle(3.2);
		ob1.show();
		ob2.show();
		
		
	}

}
