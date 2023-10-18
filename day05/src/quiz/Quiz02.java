package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 놀이공원에 있는 놀이기구에 대한이용 요금을 계산해야 한다 이 놀이기구는 탑승하면 기본 3000원의 요금을 받고 이용 시간에 따라 추가
		 * 요금이 발생한다 그 시간과 요금은 아래와 같다
		 * 
		 * 시간 요금 0 ~ 30 3000 31 ~ 40 3500 41 ~ 50 4000
		 * 
		 * 시간을 분으로 입력받아서, 요금을 출력하는 프로그램을 작성
		 * 
		 * 
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("이용 시간을 입력 :");
		int time = sc.nextInt();

		System.out.println("이용시간은 " + time + "분");

		int addTime = 0;
		int pay = 3000;

		if (time > 30) {
			// 10분 증가 할떄 마다 500원 증가
			addTime = time - 30;
			pay = 3000 + addTime / 10 * 500;

		}
		if (addTime % 10 != 0) {
			pay += 500;
		}
		System.out.println("이용 요금은" + pay + "원");

		sc.close();

	}

}
