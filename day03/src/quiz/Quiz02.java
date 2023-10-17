package quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 친구와 고기집에 갔다
		// 이 식당에서는 첫 주문에 최소 3인분을 주문해야하고
		// 이후에는 1인분씩 추가가 가능하다
		// 돼지고기 삼겹살 1인분이 8500원이고
		// 소주1병(4500원), 맥주1병(5000원)을 고정으로 주문했다
		// 추가 주문한 삼겹살 양을 입력받아서
		// 총 결제해야 할 금액을 계산하고
		// 더치페이로 1인당 얼마을 내야 하는지 계산하여 출력하는 프로그램을 작성하시오
		
	/*	
		int beef = 8500; // 삼겹살 1인분 가격
		
		int su = 4500, be = 5000; // 소주와 맥주 각 한 병의 가격

		int n; // 추가 주문한 횟 수
		
		int sum; // 총 결제 금액
		
		int pay; // 1인당 가격
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("몇번 추가 주문했습니까? :");
		n = sc.nextInt();
		n = n * 8500;
		
		
		sum = (beef * 3) + su + be + n; 	//35000 + a
		System.out.printf("총 금액은 %d입니다\n", sum);
		
		
		pay = sum /2;
		System.out.printf("1인당 내야할 금액은 %d입니다\n", pay);
		
	*/
										
/*		
	cht gpt	

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int beefPrice = 8500; // 삼겹살 1인분 가격
        int sojuPrice = 4500;
        int beerPrice = 5000;
        
        int minOrder = 3; // 최소 주문 개수
        int additionalOrder; // 추가 주문 개수
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("몇 번 추가 주문했습니까? : ");
        additionalOrder = sc.nextInt();
        
        int totalAmount = (minOrder * beefPrice) + sojuPrice + beerPrice;
        int additionalAmount = additionalOrder * beefPrice;
        
        int totalPayment = totalAmount + additionalAmount;
        
        int numberOfPeople = minOrder + additionalOrder;
        int perPersonPayment = totalPayment / numberOfPeople;
        
        System.out.printf("총 금액은 %d원이며, 1인당 내야할 금액은 %d원입니다.\n", totalPayment, perPersonPayment);
        
        sc.close();
    }
}
		
*/
		// 풀이 
		
		Scanner sc = new Scanner(System.in);

		int totoalPrice, dutchPay;
		int meatPrice = 8500;
		int soju = 4500, beer = 5000;
		int addmit;
		
		
		System.out.println("우리 식당에서는 기본 삼겹살 3인분으로 시작합니다");
		System.out.println("삼겹살 3인분, 소주 1병, 맥주 1병 주문되었습니다");
		System.out.println("삼겹살 추가 주문량을 입력하세요 :");
		addmit = sc.nextInt();

		
		totoalPrice = (meatPrice * 3) + (soju * 1) + (beer * 1);
		totoalPrice += addmit * meatPrice;
		dutchPay =  totoalPrice /2;
		
		
		System.out.printf("총 금액 : %,d원\n", totoalPrice);
		System.out.printf("1인당 결제할 금액 :  %,d원", dutchPay );
		
		sc.close();
		
		
		
		
		
		
	}

}
