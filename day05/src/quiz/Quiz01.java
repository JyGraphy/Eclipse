package quiz;

import java.util.Random;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 게시글 데이터의 총 개수가 주어지면
		// 여러 게시글을 총 몇개의 페이지로 나누어서 불러와야 할지 계산하여 출력하세요
		// 페이지 당 게시글 출력 개수는 10개이다
		// - 하나의 게시글이라도 생략되면 안된다
		// - 총 게시글 수는 10000 ~ 99999 사이이다
		// - 요청으로 읽어들여야 할 게시글의 페이지 번호가 제시된다
		// - 출력으로 불러와야 할 게시글의 번호를 n번 부터 n + 10까지 가져와야한다
		
		Random ran = new Random();
		
		int boradCount =   ran.nextInt(89999) + 10000;  // 4096
 		int pageCount = (boradCount / 10); // 수정되어야함						
 		int page = ran.nextInt(pageCount) + 1;	// ㅠㅔ이지 개수 범위 안에서 특정 페이지를 요청
		int begin= 0, end = 0; // ex 2 - 11 21
		
		// 총 게시글 개수			4096
		// 총 페이지 개수			410
		// 요청받든 페이지수			1		2		3			409		410
		// 시작값					1		11		31			4081    4091
		// 끝값					10		20		30			4090	4096
		
		
		if(boradCount % 10 != 0) pageCount += 1;
		
		begin = (page -1) * 10 +1; // page * 10 -9
		end  = begin + 9;
		
		if(end > boradCount) {
			end = boradCount;
		}
		
		
		
		
		
		
		System.out.println("총 게시글의 개수 : "	+ boradCount);
		System.out.println("총 페이지의 개수 : "	+ pageCount);
		System.out.println("요청받은 페이지 :"		+ page);
		System.out.printf("%d개의 게시글에서 %d 페이지를 요청 받았으므로, \n",boradCount ,page);
		System.out.printf("%d번 부터 %d번 게시글을 불러와서 출력하면 된다\n ",begin,end);
		
		
		
		
		
	}

}
