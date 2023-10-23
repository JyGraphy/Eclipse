package string;

import java.util.Iterator;

class Solution {
	public String solution(String new_id) {
		String answer = "";
		// 1단계
		new_id = new_id.toLowerCase();
		// System.out.println("1)" + new_id);
		

		// 2단계
		// 조건에 맞는 글자만 answer에 더하세요. 이후 단계에서는 new_id 대신 answer로 작업하면 됩니다

		for (int i = 0; i < new_id.length(); i++) {
			char ch = new_id.charAt(i);
			if ('a' <= ch && ch <= 'z') {
				answer += ch;
			}
			if ('0' <= ch && ch <= '9') {
				answer += ch;
			}
			if (ch == '-' || ch == '_' || ch == '.') {
				answer += ch;
			}
		}
		// System.out.println(answer);
		
		
		// 3단계
		while (answer.contains("..")) {
			answer = answer.replace("..", ".");
		}
		// System.out.println(answer);

		
		// 4단계
		if (answer.startsWith(".")) {
			answer = answer.substring(1);
		}
		if (answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
		}
		// System.out.println(answer);

				
		// 5단계
		if (answer.length() == 0) {
			if (answer.length() <= 3) {
				answer += 'a';

			}

		}

		// 6단계
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);

		}
		if (answer.endsWith(".")) {
		// answer = answer.substring(0, answer.length() - 1);
			answer = answer.substring(0, 14);
		}

		// System.out.println(answer);

		// 7단계
		if (answer.length() <= 2) {
			char ch = answer.charAt(answer.length() - 1);
			//answer += answer.charAt(answer.length() -1);
			while (answer.length() < 3) {
				answer += ch;

			}
		}
	//	System.out.println(answer);

		// System.out.println(answer);

		return answer; // 함수가 종료되면서 마지막에 내놓는 값(돌려주는값, 반환값)
	}
}

public class Quiz02 {

	public static void main(String[] args) { // 메인함수의 내용은 변경하지 않습니다.
		// TODO Auto-generated method stub

		String[] inputs = { "...!@BaT#*..y.abcdefghijklm", // 제시되는 입력값들
				"z-+.^.", "=.=", "123_.def", "abcdefghijklmn.p", };
		String[] outputs = { "bat.y.abcdefghi", // 제시되는 기댓값들
				"z--", "aaa", "123_.def", "abcdefghijklmn", };

		Solution solution = new Solution();

		for (int i = 0; i < inputs.length; i++) {
			String new_id = inputs[i];
			String output = outputs[i];
			String answer = solution.solution(new_id);

			System.out.printf("%d) %s\n", i + 1, answer.equals(output));

		}
		System.out.println("테스트 끝");
	}

}
