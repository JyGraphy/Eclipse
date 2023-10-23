package loop;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1) 1부터 5까지 한줄에 출력하기

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n");

		System.out.println();

		// 2) 1부터 5까지 한줄 출력코드를 다시 5번 출력하기

		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println("\n");

		}

		System.out.println();

		// 3) 다른 변수를 만들어두고 1부터 25까지 5 X 5 크기로 출력
		
		int num = 1;

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.printf(" %2d ", num);
				num++;
				if (num == 32) {
					break;
				}
			}
			System.out.println();
		}
		System.out.println();

		System.out.println();
		// 4) (i, j) 번쨰 칸에 원하는 글자를 출력하기

	
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0 ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println();
		
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i == 2 || j == 2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println();
		
		System.out.println();
		

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 4 == 0 ||  j % 4 == 0  ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println();
		

		System.out.println();
		
		
		// if ((i + j ) % 2 == 0   
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (i % 2 == 0 &&  j % 2 == 0 || i % 2 == 1 && j % 2  == 1  ) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println();
		
		
		System.out.println();
		
	
		
		

	}

}
