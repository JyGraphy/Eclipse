package polymirphism;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Human {
	String name;

	public Human(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	void info() {
		System.out.println("이름 " + name);
//		서브 클래스에서는 이 메서드를 오버라이딩해서 이름과 직업을 출력해야 합니다

	}
}

class Doctor extends Human {
	public Doctor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		// TODO Auto-generated method stub
		super.info();
	}

	void cure(Human patient) {
		System.out.printf("%s가 %s에게 읍급처치를 시행합니다\n", name, patient.name);
	}

}

class Singer extends Human {
	private final String job = "가수";

	public Singer(String name) {
		// TODO Auto-generated constructor stub
		super(name);
	}

	@Override
	void info() {
		// TODO Auto-generated method stub
		super.info();
//		System.out.printf(name + "의 직업은 %s 입니다\n", job);
	}
}

class Actor extends Human {
	private final String job = "배우";

	public Actor(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	void info() {
		super.info();
		// TODO Auto-generated method stub
//		System.out.printf(name + "의 직업은 %s 입니다\n", job);
	}
}

class Airplane {
	private Human[] seat = new Human[4];

	public boolean entrnce(Human guest) { // 손님이 입장을 시도하면
		boolean result = false; // 결과 반환 변수 (기본값 false)
		for (int i = 0; i < seat.length; i++) { // 준비된 좌석(배열) 중에서
			if (seat[i] == null) { // 빈 칸을 찾아서
				seat[i] = guest; // 빈 칸에 손님을 앉히고
				result = true; // 결과를 true로 바꾸고
				break; // 반복을 중단
			} // 만약 빈칸이 없다면 결과는 flase가 된다
		}
		return result;
		// TODO Auto-generated constructor stub
	}

	public void simulationEmergencu(int index) {
		System.out.println(seat[index].name + "손님의 배가 아픕니다");
		System.out.println("의사를 먼저 찾아야 합니다");
		System.out.println("의사를 찾아서 cure메서드를 호풀하세요");
		System.out.println("인자로 환자를 전달하면 됩니다");
		System.out.println();

		for (Human element : seat) {

			if (element instanceof Doctor) {
				Doctor tmp = (Doctor) element; // 다운캐스팅, 업캐스팅된 객체를 원래 자료형으로 되돌린다
				tmp.cure(seat[index]);
				System.out.println("환자가 살았습니다");
				break;
			} else {
				System.out.println("의사가 없습니다");
				System.out.println("환자가 죽었습니다");
				break;
			}

		}

	}
}

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Airplane air = new Airplane();

		Doctor ob1 = new Doctor("김사부");
		Singer ob2 = new Singer("정승환");
		Actor ob3 = new Actor("이병헌");
		Human ob4 = new Human("기안84");
		Human ob5 = new Human("침착맨");

		
//		ob1.info();
//		ob2.info();
//		ob3.info();
		System.out.println();

//		서브클래스에 의해 생성된 객체를 배열에 넣을 떼 업캐스팅이 발생한다
		Human[] queue = { ob1, ob2, ob3, ob4, ob5 };
		List<Human> list = Arrays.asList(queue);
		Collections.shuffle(list);
		list.toArray(queue);

		for (int i = 0; i < queue.length; i++) {
//			queue[i].info();
			boolean flag = air.entrnce(queue[i]);
			System.out.printf("%s : 탑승 %s\n", queue[i].name, flag ? "성공" : "실패");

		}
		System.out.println();
		air.simulationEmergencu(1);
		
//		슈퍼클래스의 배여에 담거나 슈퍼클래스 타입의 매개변수에 전달하면 업캐스팅이 발생한다
//		업캐스팅 상태에서도 오버라이딩 메서드는 바로 호출하여 실행하면 된다
//		오버라이딩이 아닌 고유 메서드는 다운캐스팅 후 실행해야 한다
//		다운캐스팅 하기 전에 instanceof를 활용하여 타입을 확인하고 형변환을 수행해야 한다
	}

}
