package oop;
class Card {
	int num;
	String ch;
	
	Card(String ch, int num){
		this.num = num;
		this.ch = ch;
	}
	
	void show() {
		System.out.printf("[%s ,%d}\n", ch, num);
	}
}

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 하나의 자료형으로 여러 객체를 생성해야 하는데
		// 모양은 같아도 객체마다 서로 가른값을 가져야 할 경우
		
//		Card test = new Card()	;
		
		Card ob1 = new Card("♠", 7);
		Card ob2 = new Card("♠", 2);
		Card ob3 = new Card("♠", 3);
		Card ob4 = new Card("♠", 5);
		Card ob5 = new Card("♠", 6);
		Card ob6 = new Card("♠", 9);
		Card ob7 = new Card("♠", 7);
		
		Card[] arr = {ob1, ob2, ob3, ob4, ob5, ob6,ob7};
		for (Card c : arr) {
			c.show();
		}
	}

}
