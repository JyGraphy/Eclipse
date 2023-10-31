package oop;

import java.util.Scanner;

class TV{
	// TV의 속성을 필드로 작성
	// 전원, 채널, 볼륨 그 외 필요하다고 생각하는 필드를 자유롭게 작성하세요
	String state;		// 현재 채널
	int channel = 1;		// 채널
	int volume = 5;			// 볼륨
	boolean power;			// TV ON/OFF
	
	
	// TV의 기능을 메서드로 정의
	// 전원 on/off, 채널올림/내림, 볼륨올림/내림, TV상태 출력, 음소거
	// 채널은 일정 범위안에서 sycle형식으로 순환			1 ~ 50
	// 볼륨은 일정 범위안어서 최소 최대치를 넘길 수 없다
	// 음소거는 한번 누르면 볼륨이 0이 되었다가 다시 누르면 원래 볼륨으로 복구
	// 대부분의 기능은 전원이 켜져있는 상태에서만 작동해야 합니다
	void turn( ) {
		power = !power;
		System.out.printf("현재 채널은 %d 입니다\n", channel );
		System.out.printf("현재 볼륨 : %d", volume);
	}
	
	void channelUp() {
//		this.channel = channel;
	if (power) {
		
		if (channel >= 5) {
			channel = 1;
		}
		else {
			channel++;
		}
		
		System.out.printf("현재 채널은 %d 입니다\n", channel );
	}
}	
	void channelDown( ) {
	if (power) {
		
//		this.channel = channel;
		if (channel <= 1) {
			channel = 5;
		}
		else {
			channel--;
		}
		
		System.out.printf("현재 채널은 %d 입니다\n", channel );
		
	}
	
}
	
	void volumeUp() {
		if (power) {
			if (volume == 10) {
				System.out.println("최댜 볼륨입니다 ");
			}
			else {
				volume++;
			}
			System.out.printf("현재 볼륨 : %d", volume);
		}
		
	}
	
	void volumeDown() {
		if (power) {
			if (volume == 0) {
				System.out.println("최소 볼륨입니다");
			}
			else {
				volume --;
			}
			System.out.printf("현재 볼륨 : %d", volume);
		}
		
	}
	
	void mute( ) {
		if (power) {
			int count = 0;
			int tmp, mute;
			if (count % 2 == 0) {
				
			}
			
		}
	}
	
	// 생성자에서 객체 생성 시 초기 값을 지정
	// 매개변수로 받지 않아도 초기값을 지정할 수 있다
	// 예를 들면 채널의 초기값이 0인것은 이상합니다 다른 값이 초기값이 되도록 하세요
}




public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		TV tv = new TV();
		int menu;
		 
		LOOP : while (true) {
			System.out.println("");
			System.out.println("");
			System.out.println("선택 >>>");
			menu = sc.nextInt();
			switch (menu) {
			// 입력된 메뉴에 따라서 tv메서드를 호출하는 형태로 진행
			case 1: 
				tv.turn();
				break;
			case 2:
				tv.channelUp();
				break;
			case 3:
				tv.channelDown();
				break;
			case 4: 
				tv.volumeUp();
				break;
			case 5 : 
				tv.volumeDown();
				break;
			case 6:
				tv.mute();
		
			case 7:
			case 8:
//				tv.nomute();
			case 9:
			case 0:
				break LOOP;

			}
		}
		
		sc.close();
		System.out.println("프로그램 종료");
	}

}
