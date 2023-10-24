package functiom;


public class Quiz01 {
	
	// 1)
	static int getSign(int num) {
		Integer.toString(num);
		
		return num;
	}
	// 2)
	static int getReverseNum(int num) {
		int n = 0;
		
		while (num != 0) {
			n = n * 10 + num % 10;
			num /= 10;
		}
		
		return n;
	}
	// 3)
	static int pow(int num1, int num2 ) {
		int total = num1;
		
		for (int i = 1; i < num2; i++) {
			
			total *= num1 ;
			
			}
		
		
		return total;
		
	}
	// 4)
	static int remainder(int num1, int num2) {
		 int entity = 0; 
		 
		 entity = num2 % num1;
		 
		 return entity;
	}
	// 5)
	static String  getReverseStr(String s1) {
		
		String so = "";
		
		for (int i = s1.length()-1; i > -1 ; i--) {
			so = so + s1.charAt(i);
		}
		
		return so;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		// 1) 정수를 하나 전달받아서, 양수, 음수 0을 문자열로 반환하는 함수 getSign
		
		int n1 = getSign(1);
		int n2 = getSign(-1);
		int n3 = getSign(0);
		
		System.out.println(n1);
		System.out.println(n2);
		System.out.println(n3);
		
		System.out.println();
		
		// 2) 정수를 하나 전달받아서 정수의 배치를 거꾸로 뒤집어 반환하는 함수 getReverseNum
		
		int n4 = getReverseNum(1234);
		System.out.println(n4);
		
		System.out.println();
		
		// 3) 두 정수를 전달받아서 n1의 n2제곱수를 반환하는 함수 pow
		
		int n5 = 2;
		int n6 = 10;
		int n7 = pow(n5, n6);
		System.out.println(n7);
		
		System.out.println();
		
		// 4) 두 정수를 전달받아서 n1을 n2로 나누었을때의 나머지를 반환하는 함수 remainder
		
		int n8 = 4;
		int n9 = 2;
		int n10 = remainder(n8, n9);
		System.out.println(n10);
		
		System.out.println();
		
		// 5) 문자열을 하나 전달받아서, 문자열을 거꾸로 배치한 값을 반환하는 함수 getReverseStr
		
		String st = "가지가지나뭇가지";
		String st1 =  getReverseStr(st);
		
		System.out.println(st1);
		
		System.out.println();
		
		// 함수 호출 코드에 마우스를 올려보세요
		int test = Integer.parseInt("1234");
		
		
		
		
		
		
	}

}
