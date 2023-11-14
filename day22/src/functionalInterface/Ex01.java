package functionalInterface;

interface Test {			// 함수형 인터페이스
	
	void method(String s);	// 인터페이스 중에서 추상메서드가 오직 하나만 있는 형식

}

class Repository {
	String[] arr = new String[] {
		"봉준호", "손흥민", "김연아", "박지성", "박재범"	
	};
	
	
	public void forEach(Test lambda) {					// 즉석에서 만들어서 저장
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != null) {
				lambda.method(arr[i]);
			}
		}
	}
}



public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Repository repo = new Repository();
		
		repo.forEach(str -> System.out.println(str));
		System.out.println();
		
		repo.forEach(str -> System.out.println(str.length()));
		System.out.println();
		
		
		Test lambda = (str) -> {
			String odd = "홀수";
			if (str.length() % 2 ==0) {
				odd = "짝수";
			}
			System.out.println(odd);
		};
		repo.forEach(lambda);
	}

}
