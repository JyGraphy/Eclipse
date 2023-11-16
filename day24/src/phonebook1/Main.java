package phonebook1;

import java.util.List;
import java.util.Scanner;

public class Main {
	
	static PhonebookDTO getDTOFromUserInput(Scanner sc) {
		
		PhonebookDTO dto = new PhonebookDTO();
		System.out.println("이름 입력 :");
		dto.setName(sc.nextLine());
		
		System.out.println("전화번호 입력 :");
		dto.setPnum(sc.nextLine());
		
		System.out.println("나이 입력 :" );
		dto.setAge(Integer.parseInt(sc.nextLine()));
		
		System.out.println("즐겨찾기 입력");
		dto.setFavorite(sc.nextLine());
		
		
		return dto;
		
	}


	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Handler handler = new Handler();
		
		Scanner sc = new Scanner(System.in);
		List<PhonebookDTO> list = null;
		PhonebookDTO ob = null;
		int menu = -1;
		
		String name, pnum , favorite;
		int age, row;
		PhonebookDTO dto = new PhonebookDTO();
		
		while (menu != 0) {
			System.out.println("메뉴 출력");
			System.out.println("1. 전체 목록");
			System.out.println("2. 추가");
			System.out.println("3. 전화번호 수정");
			System.out.println("4. 즐겨찾기 수정");
			System.out.println("5. 삭제");
			System.out.println("0. 종료");
			System.out.println("입력 >>>>>>>");
	
			
			menu = Integer.parseInt(sc.nextLine());
			
			switch (menu) {
			case 1:
				list = handler.selectList();	// 리스트를 받아와서
				list.forEach(System.out::println);
				handler.showList();
				
				break;
			case 2:
				
				ob = getDTOFromUserInput(sc);
				row = handler.insertPhonebook(dto);
				System.out.println(row !=0 ? "추가성겅" : "추가실패");
//				System.out.println("이름 입력 :");
//				name = sc.nextLine();
//				
//				System.out.println("전화번호 입력 :");
//				pnum = sc.nextLine();
//				
//				System.out.println("나이 입력 :" );
//				age = Integer.parseInt(sc.nextLine());
//				
//				System.out.println("즐겨찾기 입력");
//				favorite = sc.nextLine();
//				
//				
//				
//				dto.setName(name);
//				dto.setPnum(pnum);
//				dto.setAge(age);
//				dto.setFavorite(favorite);
//				
//				row = handler.insert(dto);
				
				break;
				
			case 3:
				System.out.println("전화번호 수정");
				System.out.println("이름 입력 :");
				name = sc.nextLine();
				
				System.out.println("변경할 전화번호 입력 :");
				pnum = sc.nextLine();
				
				row = handler.updatePnum(name, pnum);
				System.out.println(row !=0 ? "수정 성공" : "수정 실패");
//				handler.updatePnum(dto);
				break;
				
			case 4:
				System.out.println("즐겨찾기 등록 및 해제");
				System.out.println("즐겨찾기 상태를 변경할 사람의 이름 입력 :");
				name = sc.nextLine();
				row = handler.updateFavorite(name);
				
				System.out.println(row !=0 ? "수정 성공" : "수정 실패");

				break;
				
			case 5:
//				handler.delete(name);
				System.out.println("삭제할 사람의 이름 입력 :");
				name = sc.nextLine();
				row = handler.delete(name);
				System.out.println(row !=0 ? "삭제 성공" : "삭제 실패");
				break;
				
			case 0:
				
				break;
			}
			System.out.println();
		
		}
		sc.close();
		System.out.println("프로그램 종료");
		
	}












	

}
