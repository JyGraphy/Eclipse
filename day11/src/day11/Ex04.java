package day11;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 자판기
		// 돈을 입력받은 다음, 상품을 준비하고, 준비된 상품 수량 안에서 상품을 판매하고
		// 거스름돈을 계산하여 내어주는 프로그램
		
		// 이 코드의 아쉬운점
		// 1. 변수의 개수가 너무 많고, 관련성 있는 변수들을 묶어서 처리할 방법이 없다 !!
		
		

		// 콜라, 사이다, 비타민, 이온
		int cokeAmount = 3;
		int ciderAmount = 3;
		int viramAmount = 3;
		int ionAmount = 3;

		int cokePrice = 800;
		int ciderPrice = 700;
		int viramPrice = 500;
		int ionPrice = 1000;

		int money_income = 0; // 입력받는 돈을 저장할 변수
		int money_remainder = 0; // 거스름돈을 계산하여 출력할 변수

		Scanner sc = new Scanner(System.in);

		int menu = 0;

		String result; // 함수의 실행결과를 받기 위한 변수

		Loop: while (true) {
			System.out.printf("자판기 현재 급액 : %,d원\n", money_income);
			System.out.println("1. 금액투입 :");
			System.out.println("2. 음료선택 :");
			System.out.println("0. 종료 :");
			System.out.println("선택 :");
			menu = sc.nextInt();

			switch (menu) {
			case 1: // 돈을 입력 받아서 money_income에 저장하고 다시 반복
				System.out.println("금액을 입력 :");
				money_income += sc.nextInt();
				break;

			case 2: // 상품 목록을 보여주고, 선택 받아서 금액을 계산하고 수량을 감소 시키고 출력
				System.out.printf("1) 콜라 \t(%d)\n", cokePrice);
				System.out.printf("2) 사이다\t (%d)\n", ciderPrice);
				System.out.printf("3) 비타음료\t (%d)\n", viramPrice);
				System.out.printf("4) 이온 \t(%d)\n", ionPrice);

				menu = sc.nextInt();

				// 1번을 선택했고, 콜라의 양이 충분하고, 넣은 돈이 콜라 가격보다 같거나 클떄

				if (menu == 1 && cokeAmount > 0 && money_income >= cokePrice) {
					// cokeAmount -= 1; // 수량 -1 감소
					// money_income -= cokePrice; // 반환할 돈을 준비
					// money_income = 0;
					result = vending(menu, money_income, ciderAmount);

					if (result.startsWith("[") == false) { // 문제 없음
						money_remainder = Integer.parseInt(result);
						money_income = 0;
					} else {
						System.out.println(result);
					} // 받은돈을 0으로 처리

				} else if (menu == 2 && ciderAmount > 0 && money_income >= ciderPrice) {
					result = vending(menu, money_income, ciderAmount);

					if (result.startsWith("[") == false) { // 문제 없음
						money_remainder = Integer.parseInt(result);
						money_income = 0;
					} else {
						System.out.println(result);
					}
				}

				else if (menu == 3 && viramAmount > 0 && money_income >= viramPrice) {
					result = vending(menu, money_income, viramAmount);

					if (result.startsWith("[") == false) { // 문제 없음
						System.out.println("거스름돈 : " + result);
						money_remainder = Integer.parseInt(result);
						money_income = 0;
					} else {
						System.out.println(result);
					}
				}

				else if (menu == 4 && ionAmount > 0 && money_income >= ionPrice) {
					result = vending(menu, money_income, ionAmount);

					if (result.startsWith("[") == false) { // 문제 없음
						System.out.println("거스름돈 : " + result);
						money_remainder = Integer.parseInt(result);
						money_income = 0;
					} else {
						System.out.println(result);
					}
				}

				else {
					System.out.println("상품수량이 부족하거나, 금액이 부족합니다");
				}

				break;

			case 0:
				break Loop;

			default:
				System.out.println("잘못입력하셨습니다");

			}
			System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");

		}
		sc.close();

	}

	static String vending(int menu, int money, int amount) {
		String name = "";
		int price = 0;
		switch (menu) {
		case 1:
			name = "콜라";
			price = 800;
			break;
		case 2:
			name = "사이다";
			price = 700;
			break;
		case 3:
			name = "비타";
			price = 500;
			break;
		case 4:
			name = "이온";
			price = 1000;
			break;

		}
		if (amount < 1) {
			return "[수량이 부족합니다]"; // 문제가 있어서 처리할 수 없을 때는 반환 문자열이 대괄호로 시작한다
		}
		if (money < price) {
			return "[금액이 부족합니다]";
		}
		System.out.printf("%s 음료 나왔습니다.\n", name); // 음료를 내어준다
		System.out.printf("거스름돈 : %,d원 \n", money - price); // 거스름돈 반환
		return String.valueOf(money - price);
	}

}
