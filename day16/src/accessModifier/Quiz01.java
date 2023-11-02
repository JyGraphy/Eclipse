package accessModifier;

import java.util.Arrays;

class Member {
	private String name;
	private int age;
	
	
//	핃드를 사용하는 생성자 (저장 -> 우클릭 -> s, o -> 엔터)
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}
//	public getter/setter (저장 -> 우클릭 -> s, r -> alt + a, alt + r)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void show() {
		System.out.printf("%s : %d살\n", name, age);
	}
	public int compareTo(Member member) {
		// TODO Auto-generated method stub
		return 0;
	}

}


public class Quiz01 {
	
//	결론 : 객체와 객체는 직접적인 비교가 힘들기 때문에
//	특정 필드값을 기준으로 정렬해야한다
//	primitrve 타입이거나, compareTo 함수가 있는 자료형으로 기준을 선정한다(String)

	
	private static final String[] Member = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Member[] arr = new Member[] {
				new Member("원빈", 45),
				new Member("현빈", 41),
				new Member("우빈", 34),
				new Member("준빈", 31),
				new Member("다빈", 29),
		};
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] .show();
		}
		System.out.println();
		
		
		// 이름을 기준을 arr를 오름차순하느 함수를 만들어서 수행하고 출력
//		   비교는 객체의 이름을 기준으로 하고, 자리변경은 객체를 교환
		sortMemberArrayByName(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] .show();
		}
		System.out.println();
		
		
//		나이를 기준으로 arr를 오름차순하는 함수를 만들어서 정렬을 수행하고 출력
//		비교는 객체의 나이를 기준으로 하고, 자리변경은 객체를 교환
		sortMemberArrayByage(arr);
		for (int i = 0; i < arr.length; i++) {
			arr[i] .show();
		}
		System.out.println();
		
		
		
	}
	
	
	static Member[] sortMemberArrayByName(Member[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
//				Member끼리는 비교가 안된다
				if (arr[i].getName().compareTo(arr[j].getName()) > 0) {
					Member tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		
		return arr;
		
	}
	
	static Member[] sortMemberArrayByage(Member[]arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getAge() - arr[j].getAge() > 0) {
					Member tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		
		return arr;
	}
	
	
	
	
	
	

}
