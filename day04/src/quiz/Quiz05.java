package quiz;

import java.util.Random;
import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int eleA, eleB, eleC ;
		int me, minA, minB, minC, minFinal;
		
		eleA = ran.nextInt(15) + 1;
		eleB = ran.nextInt(15) + 1;
		eleC = ran.nextInt(15) + 1;
		
		System.out.printf("%d, %d, %d\n", eleA, eleB, eleC);
		
	
		// 현재 자신의 위치를 1 ~ 15 사이로 입력한 다음
		// 가장 가까운 엘리베이터가 몇번째인지 출려하는 코드를 작성하세요
		// (가장 가깝다 = 거리값이 최소이다 = 차이의 절대값이 최소값이다
		
		
		
		
		System.out.println("자신의 층수 (1 ~ 15사이에서 입력) : ");
		me = sc.nextInt();
		
		System.out.printf("현재 층수는 %d층\n", me);
		
		// 절대값 구현
		eleA = (eleA - me);
		eleB = (eleB - me);
		eleC = (eleC - me);
		
		
		if (eleA < 0) {
			minA = -eleA;
		}
		else {
			minA = eleA;
		}
		
	
		
		if (eleB < 0) {
			minB = -eleB;
		}
		else {
			minB = eleB;
		}
				
		if (eleC < 0) {
			minC = -eleC;
		}
		else {
			minC = eleC;
		}
		
		// 층수의 최소층 비교
		
		// 층수 최소 비교
		minFinal = minA;
		if(minFinal > minB) {
			minFinal = minB;
			System.out.println("가장 가까운 엘리베이터는 2번");

		}
		
				
		else if(minFinal > minC) {
			minFinal = minC;
			System.out.println("가장 가까운 엘리베이터는 3번 ");

		}
		else
		{
			System.out.println("가장 가까운 엘리베이터는 1번 ");
			
		}
		
	sc.close();	
		
		
		
		
		
		
		
		
	}

}
