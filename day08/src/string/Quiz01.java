package string;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 주어진 문자열에서 알파벳만 가져와서 새로 구성된 문자열 s2를 출력하세요

		String s1 = "a1Bc3D4e5";
		String s2 = " ";

		for (int i = 0; i < s1.length(); i++) {
			char ch = s1.charAt(i);

			if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
				s2 += ch;
			}
			// ch가 알파벳이면 s2에 더한다

		}
		System.out.println(s2);

	}

}