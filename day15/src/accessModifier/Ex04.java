package accessModifier;

import java.util.Scanner;

public class Ex04 {


	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Human 타입의 객체를 저장할 수 있는 배열을 준비
		// while, switch ~ case를 이용하여 메뉴를 선택하는 형식
		// 메뉴 선택에 따라 입력 및 출력을 수행하는 프로그램
		
		Scanner sc = new Scanner(System.in);
		Human[] arr = new Human[5];
		
		int menu;
		String name;
		int age;
		boolean hasnull = false;			// 빈칸이 하나라도 있으면 true로 바꿀거다
		
		
		
		
		while (true) {
			System.out.println("1. 입력");
			System.out.println("2. 출력");
			System.out.println("0. 종료");
			System.out.println("선택 >>>");
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:			
				hasnull = false;
				
				
				
										// 빈칸를 찾아서 빈칸에 데이터를 입력하고 반복 탈출
										// 만약 모든 칸이 채워져서 빈칸이 없으면 메시지 출력
			for (int i = 0; i < arr.length; i++ ) {

				if (arr[i] == null) {
					hasnull = true;
				System.out.println("이름 입력 :");
				name = sc.nextLine();
				System.out.println("나이 입력 :");
				age = Integer.parseInt(sc.nextLine());
				
				arr[i] = new Human();
				arr[i].setName(name);
				arr[i].setAge(age);
				
				
				break;
				}
			}
			if (hasnull == false) {
				System.out.println();
			}
				break;
			case 2:						// 빈칸을 제외한 모든 데이터를 화면에 출력
										// 모든 칸이 비어 있으면 아무것도 출력하지 않는다
				
				for (int i = 0; i < arr.length; i++) {
					if (arr[i] != null) {
						System.out.printf("%s : %d살\n", arr[i].getName(), arr[i].getAge());
						}
					}
				
				System.out.println("===========");
				break;
				
			case 0:
				sc.close();
				return;				// main함수를 즉시 종료한다
			
			default:
				System.out.println("잘못 선택하셨습니다");
			}
			System.out.println();
		}
		
	}

}
