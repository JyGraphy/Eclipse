package loop;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열에 더하면 새로운 문자열이 된다
		
		String s1 = "";
		
		for (int i = 0; i < 5; i++) {
			s1 += i;
			
		}
		
		for (char ch = 'A'; ch <=
				'E'; ch++) {
			s1 += ch;
		}
		
		System.out.println("s1 : "+ s1);
		
		// 문자열에서 특정 글자만 새로운 문자열에 더하기
		
		String s2 = "";
		String text1 = "Java is easy, Jave is funny";
		
		for (int i = 0; i < text1.length(); i++) {
			char ch = text1.charAt(i);
			
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o'|| ch == 'u') {
				s2 += ch;
			}
		}
		System.out.println("s2 :" +s2);
		System.out.println("s2.lenght() : " + s2.length() );
		System.out.println();
		
		
		
		
		
		
		
	}

}
