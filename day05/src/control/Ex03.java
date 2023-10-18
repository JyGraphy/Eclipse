package control;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// switch에는 정확한 값의 일치 비교가 가능한 형내로 변수가 와야한다
		// 따라서 근사치를 처리하는 부동소수점 방식의 실수(float, double)은 처리할 수 없다
		
		// 문자열의 비교는 가능하다
		
		
		int num =5;
		double db= 2.1;
		String str = "A";
		
		
		switch (str) {
		case "A":							// if (str == "A") 		(X)
			System.out.println("one");		// if (str.equals("A))  (O)
			break;
		case "B":
			System.out.println("two");
			break;
		}
		
		// switch에 변수 혹은 변수를 포함하느 연산식도 가능하다
	
		int num2 = 125;
		
		switch (num2 % 2) {
		case 0:	System.out.println("짝수");	break;
		case 1: System.out.println("홀수");
			
		}
	
	
	
	
	
	
	
	
	
	
	}

}
