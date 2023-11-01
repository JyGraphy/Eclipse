package accessModifier;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Human 클래스를 이용하여 비어있는 상태의 객체를 하나 생성하세요
		
		Scanner sc = new Scanner(System.in);
		Human ob = new Human();
		
		
		// 본인의 이름과 나이를 키보드로 입력하여 그 값을 ob에 저장하고
		// 한줄에 출력
		System.out.println("본인의 나이와 이름을 입력하시오");
		System.out.print("이름 :");
		String name = sc.nextLine();
		
		System.out.print("나이 :");
		int age = sc.nextInt();
		sc.close();
		
		ob.setName(name);
		ob.setAge(age);
		
		
		System.out.printf("이름  : %s,  나이 :  %d\n", ob.getName(), ob.getAge());
		
		

	}

}
