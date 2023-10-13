package operator;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 단항 증감 연산자 : 1개의 변수에 붙어서 값을 1증가시키거나, 1 감소시킨다
		// 변수 앞에 붙으면 전위/전치
		// 변수 뒤에 붙으면 후위/후치
		// 전위 연산자는 먼저 값을 증감시키고 수식을 처리
		// 후위 연산자는 수식을 처리하고, 이후에 증감
		
		int num = 10;
		System.out.println(num++); 		//출력한 다음 1 증가시킨다
		System.out.println(++num); 		//먼저 1증가시키고 이후 출력한다
		System.out.println(--num);		//먼저 1감소시키고 이후 출력한다
		System.out.println(num--);		//출력한 다음 1 감소시킨다
		
		System.out.println("num : " +num);
		System.out.println();
		
		int n1 = 2, n2 = 1, n3 = 0, n4 = -1;
		int a1 = (n1++) + (++n2);
		int a2 = (n1 += 1) + (n2 += 1);
		
		
		System.out.println(a1);
		System.out.println(a2);
		System.out.println();
		
		for (int i = 0; i < 5; i ++) {
			System.out.println(i);
		}
		
	}

}