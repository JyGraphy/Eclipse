package loop;

public class Quiz01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				// 1) 자신의 이름을 5회 반복하여 출력하세요
				int n1 = 0;
				String name = "박재영";
				while (n1 < 5) {
					System.out.println(name);
					n1 ++;
				}
				
				System.out.println();
				
				// 2) 0부터 5까지 한줄에 출력하세요
				n1 = 0;
				while (n1 < 6) {
					System.out.print(n1);
					n1++;
				}
				
				System.out.println();
				
				// 3) 5부터 0까지 한줄에 출력하세요
				 n1 = 5;
				while (true) {
					System.out.print(n1);
					n1 --;
					if (n1< 0) {
						break;
					}
					
				}
				
				System.out.println();
				
				// 4) 1부터 100까지의 합계를 구하여 출력하세요
				int sum = 0;
				n1 = 1;
				
				while (n1 < 101) {
					sum += n1;
					n1++;
				}
				System.out.println(sum);
				
				
				System.out.println();
				
				
				// 5) 1부터 100사이의 정수 중, 7의 배수만 한줄에 출력하세요
				n1 = 1;
				
				while (n1 <= 100) {
					n1++;
			
					if (n1 % 7 == 0) {
						System.out.print(n1+ " ");
					}
					
				}
				System.out.println();
				
				int i = 7;
				while (i < 101) {
					System.out.print(i + " ");
					i += 7;
				}
				System.out.println();
				
				
				
			}

		}




