package quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		String input;
		int num1;
		int num2;
		String gender;
		
		
		System.out.println("주민등록번호 13자리 입력 (xxxxxx- yyyyyyy)");
		System.out.print("입력 :");
		input = sc.next();

		num1 =	Integer.parseInt(input.split("-")[0]);
		num2 =	Integer.parseInt(input.split("-")[1]);
		
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
	    System.out.println();
	    
	    // 4자리의 출생연도, 2자리의 출생월, 2자리의 출생일
	    // 그리고 성별은 문자열로 준비하여 모두 출력하세요
	    
	    int year, month, day, total;
	    
	    total = num1; 
	    year = num1 / 10000;
	    day = num1 % 100;
	    num1 = num1 /100;
	    month = num1 % 100  ;
	
	    
	    
	    System.out.println(year);
	    System.out.println(month);
	    System.out.println(day);
	    
	    switch (year /10) {
		case 9:
			year += 1900;
			break;
		case 0:
			year += 2000;
			break;
		}
	    
	    
		System.out.println("출생연도 : "+  year+"년," + month +"월," +  day + "일");
		
		
		
		
		//month /10;
		
		switch (num2 / 1000000) {
		case 1 : case 3:
			gender  = "남성";
			System.out.println(gender);
			break;

		case 2 : case 4 : 
			gender  = "여성";
			System.out.println(gender);
			
			default:
				gender = null;
		
		}
		
		
	}

}
