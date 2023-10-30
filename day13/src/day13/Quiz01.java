package day13;

import java.util.Random;

public class Quiz01 {

	static int[] getnum() {
		int[] num = new int[6];
		Random ran = new Random();
		int count = 0;
		
		while (count < 6) {
			num[count] = ran.nextInt(45) + 1;
			count +=1;
			
			for (int i = 0; i < num.length; i++) {
				for (int j = i + 1; j < count; j++) {
					if (num[i] == num[j]) {
						count--;
					}
				}
			}
		}
		return num;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("응시자 : 박재영\n");

		int[] ns = null;
		int count = 0;
		while (count < 5) {
			ns = getnum();
			sort(ns);
			show(ns);
			count++;
			//System.out.println(Arrays.toString(ns));
		}

	}

	static int[] sort(int[] k) {
		int n = k.length;
		for (int i = 0; i <= n; i++) {
			for (int j = i + 1; j < n; j++) {
				int tmp = 0;
				if (k[i] > k[j]) {
					tmp = k[i];
					k[i] = k[j];
					k[j] = tmp;

				}
			}

		}
		return k;

	}
	
	
	static int[] show(int[] ns) {
		int [] sn = new int[ns.length];
		
		for (int i = 0; i < ns.length; i++) {
			sn[i] += ns[i];
			System.out.printf("%2d, ",sn[i]);
			if (i == 5) {
				System.out.println("");
			}
		}
		System.out.println();
		
		
		return sn;
	}

}
