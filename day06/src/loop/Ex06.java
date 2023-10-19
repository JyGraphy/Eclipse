package loop;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 30일동안 은행에 돈을 입금한다
		// 첫날에 10원, 다음날에 20원, 다음날에 40원
		// 이런 식으로 전날의 두배을 준비하여 입금한다
		// 30일째 입금이 끝난후
		// 31일째 은행에 누적된 총 금액은 얼마인지 계산하여 출력하세요
		// (금액에 천단위 구분 기호 콤마를 적용하여 출력하세요)
		
		/*
		double money = 10, total = 0, daym = 0;
		int day =0;
		System.out.println("1일 입금 금액입니다" + money +"원");
		
		while (day < 30) {
			day++;
			daym += (money * 2)   ;
			
			total = daym + money;
		
			System.out.printf("%d일 누적 금액입니다 %d\n", day, total);
			
			
		}
		System.out.printf("총 누적 금액은 %,d 입니다\n ", total);
		*/
		
  		int day = 1;
		long bank = 0, money = 10;
		
		while (day <= 30) {
			bank += money;
			money *= 2;
			day +=1;
		}
		System.out.printf("%d일째 금액 : %,d원\n", day, bank);
		
	}

}
