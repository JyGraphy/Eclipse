package string;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = "a1Bc3D4e5";
		String filter = "12345678"; 			//"abcdefgABCDEFG";
		String s2 = " ";
		

		for (int i = 0; i < s1.length(); i++) {		// 전체 글자 중에서
			char ch = s1.charAt(i);					// 각 글자를 ch라고 할때
			String s = ch + "";						// contains 함수에는 문자열을 전달해야 한다
			if (filter.contains(s)) {				// 필터가 글자를 포함하면(글자가 필터에 포함되면)
				s2 += s;							// 결과에 포함시킨다
			}
			// ch가 알파벳이면 s2에 더한다

			// System.out.println(arr1);
			// System.out.print(ch);
		}
		System.out.println(s2);

	}

}

// filter에 있는 값과 s1에 있는 값에서 filter에 있는 값만 대조하여 일치하는 값만 s2에 저장후 출력한다
// 결국 기준값은 filter에 값에 따라 결정된다

