package loop;

import java.util.Random;
import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		int answer = ran.nextInt(100) +1;
		int user;
		int count = 0;
		
		// 반복을 수행하면서
		// 		사용자에게 값을 입력박고
		//		만약 정답이 입력값보다 작으면 DOWN
		//		정답이 입력값보다 크면 up
		//		일치하면 반복을 중단
		//		반복할때마다 횟수를 증가 시키기
		
		//  반복이 끝나면 정답과 횟수를 출력하고 종료

		
		
		while (true) {
			System.out.print("값을 입력하시오 :");
			user = sc.nextInt();
			
			if (answer < user) {
				
				System.out.println("DOWN");
			}
			else if(answer > user ){
			
				System.out.println("UP");

			}
			else {
				break;
			}
			count++;
			
		}
		System.out.println(answer);
		System.out.printf("정답은 %d이고 횟수는 %d 입니다\n", user, count);
		
		sc.close();
		
	}

}
