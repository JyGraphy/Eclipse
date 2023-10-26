package day11;

import java.awt.Container;
import java.util.Random;
import java.util.Scanner;

public class Ex03 {

	// 1 ~ 5까지 확률은 100퍼센트 레벨이 5 일떄 90
	// 강화 확률은 랜덤 , 강화시 레벨 -1 
	// 돈을 다 소진할떄 까지 반복
	
	
	static int min (int money) {
		
		for (int i = money; i < 500 ; i++) {
			
		}
		
		
		return money;
	}
	
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);	
		int lv = 1, money = 10000;
		int so = 500; // 한 회당 강화 비용
		int menu;
		boolean flag;
		
		System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
		System.out.println("현재 레벯 :" +lv);
		System.out.println("현재 머니 :" +money);
		
		System.out.println("1. 강화");
		System.out.println("2. 포기");
		System.out.println("메뉴 선택 : ");

		menu = sc.nextInt();
		Loop :	
	
	
		switch (menu) {
		case 1:
			if (money < so) {
				System.out.println("강화 비용 부족");
				break Loop;
			}
			for (int i = 0; i < 3; i++) {
				System.out.println(".");
				try {Thread.sleep(500);} catch(Exception e) {}
			}
			System.out.println();
			flag = enhance(lv);
			money -= so;
			
			lv += flag ? 1 : -1;
			break;
		case 2:
			break Loop;
			default :
				
		}
		
		
		
		
		System.out.println("최종 결과");
		System.out.println("현재 레벨 : " +lv);
		System.out.printf("현재 머니 : %,d원\n", money);
		System.out.println("점수 :" + (lv * 1000 + money));
		
		sc.close();
		}	
		// end of main() 프로그램 실행 시 가장 먼저 실행되는 함수이다
	
	
	static boolean enhance(int lv) {
		boolean success = true;
		Random ran = new Random();
		
		int limit = 100 - (lv -4) * 10;
		
		int value = ran.nextInt(100) +1;
		String fall = "강화성공";
		
		// 현재 퍼센트 확률 (5에서 90 그 후 10퍼씩 떨어진다)
		
		
		if (lv > 4 ) {
			//per = 	per - (lv -4) * 10;
			
		
		}
		if (value > limit ) {
			success = false;
			fall = "강화실패";
		}
		System.out.printf("%d	/ %d (%s)\n", value, limit, value <= limit ? "성공" : "실패");
		success = value <= limit;
		return success; 
	}
	

}	// end of class : main() 혹은 다른 함수들은 모두 class 내부에 있어애 한다







