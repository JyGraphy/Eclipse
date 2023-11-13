package exception;

import java.util.Scanner;

// Exception 클래스의 서브 클래스르 직접 작성하여 내가 규정하는 타입의 예외를 만들고 사용하기

class MyException extends Exception {

	private static final long serialVersionUID = 1L;

	@Override
	public String toString() {
		return "범위를 넘어갔다";
	}

}

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int num;
		while (true) {
			try {
				System.out.println("정수 입력 :");
				num = sc.nextInt();
				if (0 <= num && num <= 100) {
					break;
				}
				MyException e = new MyException();
				throw e; // 내가 만든 예외 객체를 던진다 (catch블록이 받을 수 있도록)
			} catch (MyException e) {		// catch에서는 try내부에서 던진 (throw)예외를 받아서 처리
				System.out.println(e);
				continue;

			}
		}
		sc.close();
		System.out.println("프로그램 종료");
	}

}
