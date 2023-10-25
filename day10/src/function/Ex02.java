package function;

public class Ex02 {
	
	static int add(int num1, int num2) {
		
		int sum = num1 + num2;
		
		return sum;
		
		
	}
	static int getMinNumber(int num1, int num2, int num3) {

		int min = num1;
		
		if (num1 < num2 && num1 < num3) {
			min = num1;
		}
		else if(num2 < num3) {
			min = num2;
		}
		else {
			min = num3;
		}
		
		return min;
	}
	static String upperCase(String s1) {
		String answer = "";
		
		for (int i = 0; i < s1.length(); i++) {
			char sn = s1.charAt(i);
			
			if (i == 0 && 'a' <= sn && sn <= 'z') {
				sn -= 32;		// 첫 글자가 소문자이면 대문자로 바꿔서 넣어라
				
			}
			answer += sn; // i번쨰 글자(ch)를 answer에 순서대로 더한다
			
	 	}
		
		return answer;
	}
	static String substring(String str, int from, int to) {
		
		String st = "";
		
		for (int i = from; i < to; i++) {
			st += str.charAt(i);
		}
		
		
		return st;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1) 두 정수의 덧셈을 반환하는 함수 add를 작성하세요
		int sum = add(5, 2);
		System.out.println("sum : " + sum);
		
		System.out.println();
		
			
		
		// 2) 세 정수를 전달 받아서 가장 작은 수를 반환하는 getMinNumber를 작성
		int min = getMinNumber(3, 5, 2);
		System.out.println("min :" + min);
		
		
		System.out.println();
		
		// 3) 문자열 하나를 전달 받아서, 첫글잘르 대문자로 변환하는 함수 upperCase를 작성하세요
		String q3 = upperCase("hello");
		System.out.println("q3 : "+q3); // Hello
		
		String t3 = upperCase("3 year later");
		System.out.println("t3 :"+ t3); // 3 Year later
		
		System.out.println();
		
		// 4) 문자열 하나와 정수 두개를 전달 받아서
		// 문자열의 from 번째 글자부터 to 글자 이전까지의 글자를 잘라낸
		// 새로운 문자열을 반환하는 함수 substring을 작성하세요
		
		String q4 = substring("Hello, world !!", 0, 5);
		System.out.println("q4 : " +q4);
		
		String t4 = substring("Hello, wrold !!",7, 12);
		System.out.println("t4 : "+t4);
		
		
	}

}
