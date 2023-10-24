package star;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 횟수를 제어할 변수를 미이 만들어두고 내가 직접 횟수를 변경 / 제어하기
		
		int size = 9;
		int st = 1  ;
		int sp = size - st * 2;
		
		for (int i = 0; i < size; i++) {
			
			
			for (int j = 0; j < st; j++) { 		//0, 1, 2
				System.out.print("* ");
			}
			
			for (int j = 0; j < sp; j++) {
				System.out.print("  ");
			}
			
		
			
			for (int j = 0; j < st; j++) {//	0, 2, (4실행되지 않음. st는 3이므로)
				System.out.print("* ");
			if (i == size / 2 && j == 0)  {
				j++;
			}	
				
				
			
			}											// 한줄이 끝나면 줄바꾸기
			System.out.println();
			
			if (i  < size / 2) {	// 전체 줄 중에서 가운데 도달하지 못했다면(윗부분)
				 sp -= 2;
				 st += 1;
			}
			else  {	// 가운데 줄이거나 아랫쪽이면
				sp += 2;
				st -= 1;
	
			}
			
		
		
		
		
		}

	}
}
