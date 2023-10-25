package function;

public class Ex03 {

	// 두 정수 중에서 가장 큰 수 반환하기
	// 함수이름이 같고 여러개일경우 매개변수의 개수 같거나 자료형이 다르면 중복정의가 가능하다  = 오버로딩(함수에서만 적용)
	static int getMaxNum(int n1, int n2) {
		int answer = 0;
		
		if (n1 > n2) {
			answer = n1;
		}
		else {
			answer = n2;
		}
		
	//	return n1 > n2 ? n1 : n2;
		return answer;
	}
	static int getMaxNum(int n1, int n2, int n3) {
		int answer = 0;
		
		if(n1 < n2) answer = n2;
		if(n2 < n3) answer = n3;
		
		return answer;
		
	}
	
	
	// n개의 정수 중에서 가장 큰 값을 반환하기
	static int getMaxNum(int...args) {	// 같은 자료형의 여러 매개변수 개수가 일정하지 않을때
										// 가변인자 : 인자의 개수가 일정하지 않다
		int result = 0;
//		for (int i = 0; i < args.length; i++) {		// 매개변수들을 순서대로 조회하면서
//			int num = args[i];						// 각 숫자를 num이라고 할 때
//			if (result < num) {						// 기존 최대값보다 더 큰 값이 있으면
//				result = num;						// 그 값을 최대값에 담는다
//			}
		for (int num : args ) {
			if (result < num) {
				result = num;
			}
		}
		
		return result;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 = getMaxNum(10, 20);
		
		int num2 = getMaxNum(10, 20, 30);
		
		int num3 = getMaxNum(1, 2, 3, 4, 5, 60, 700, -8, 99);
		
		System.out.println("num1 : " +num1);

		System.out.println("num2 : " +num2);

		System.out.println("num3 : " +num3);
		
		
		
	}

}
