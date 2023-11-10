package collection;

import java.util.ArrayList;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Test2> list = new ArrayList<>();
		list.add(new Test2("iu930516", "이지은"));
		list.add(new Test2("yellow", "홍진호"));
		list.add(new Test2("danbi", "나단비"));
		
		for (int i = 0; i < list.size(); i++) {
			Test2 ob = list.get(i);
			System.out.printf("%s : %s \n", ob.getId(), ob.getName());
		}
		
		System.out.println();
		
//		id 오름차순
		list.sort((o1 ,o2) -> o1.getId().compareTo(o2.getId()));
		
		for (int j = 0; j < list.size(); j++) {
			Test2 ob = list.get(j);
			System.out.printf("%s : %s \n", ob.getId(), ob.getName());

		}
		System.out.println();
		
		list.sort((o1 , o2) -> o2.getName().compareTo(o1.getName()));
		
	}

}
