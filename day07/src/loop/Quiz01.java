package loop;

import java.util.Iterator;
import java.util.Scanner;
import java.io.File;

public class Quiz01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		String data = "";
		File f = new File("C:\\windows\\system32\\drivers\\etc\\hosts");
		
		Scanner sc = new Scanner(f);
		
		while (sc.hasNextLine()) {
			data += sc.nextLine() + "\n";
		}
		sc.close();
		
		System.out.println(data);
		
		// 문제) data 변수에 들어있는 글자 중에서 대문자의 개수는 총 몇개일까요?
		
		int count = 0;
		char[] arr = data.toCharArray();
		
		for (int i = 0; i <data.length() ; i++) {
			char ch = arr[i];
			
			if ('A' <= ch && ch <='Z') {
				System.out.println(arr);
				count += 1;
			}
			
			
		}
		System.out.println();
		System.out.println(count);
		
		System.out.println();
		
		
		// 위와 비슷한 구조의 숫자 문제
		// 1에서  1000사이의 정수 중에서 13과 17의 공배수는 총 몇개인지 출력하세요
		
		count = 0;
		int i = 1;
		for (i = 1; i <= 1000; i++) {
			if (i % 13 == 0 && i % 17 == 0) {
				System.out.println(i);
				count +=1;
			}
		}
		System.out.println();
		System.out.println(count);
		
	}

}
