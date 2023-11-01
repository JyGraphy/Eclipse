package accessModifier;

import java.util.Scanner;

class  Handler5 {
	private Human[] arr = new Human[5];

	// 이름과 나이를 전달 받아서, Human형태의 객체를 생성하고, 배열에 추가하는 함수
	public int add(String name, int age) {
		int row = 0;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == null) {

				arr[i] = new Human();
				arr[i].setName(name);
				arr[i].setAge(age);
				row = 1; // 1개의 데이터를 추가했다는 의미

				break;
			}
		}
		return row;
	}

	// 전체 내용을 출력하는 함수

	public void showList() {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
			}
		}

		System.out.println("===========");
	}

}

public class Ex05 {

// 이 프로그램에서 다룰 단일 데이터의 형태 : class Human	

// 이 프로그램의 내부 기능을 담당하는 형태
	

//이 프로그램의 입출력 및 UI를 담당하는 형태

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Handler5 handler = new Handler5();
		int menu;
		String name;
		int age;
		int row;

		while (true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());

			switch (menu) {
			case 1:
				System.out.println("이름 입력 :");
				name = sc.nextLine();
				System.out.println("나이 입력 :");
				age = Integer.parseInt(sc.nextLine());
				row = handler.add(name, age);
				System.out.println(row != 0 ? "추가성공" : "추가실패");
				break;

			case 2:
				handler.showList();
				break;
				
				
			case 0:
				sc.close();
				return; // main함수를 즉시 종료한다

			default:
				System.out.println("잘못 선택하셨습니다");
			}
			System.out.println();
		}
	}

}
