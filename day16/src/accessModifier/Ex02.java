package accessModifier;

class Message {
	
	private String name;
	// 자료형이 같으면 서로 자유롭게 접근이 가능하다
	
	public Message(String name) {
		this.name = name;
	}
	
	
	void sendMessage(Message other, String message) {
		
//		받는 사람의 receoveveMesssage를 호출한다
//		이때 전달하는 this는 sendMessage를 호출했던 자기자신이다
//		따라서 this의 자료형은 Message이다
		
		
		other.receieveMessage(this, message);
		
	}
	
	void receieveMessage(Message sender, String message) {
//		this는 보낸사람
		System.out.printf("======%s의 화면=====\n", this.name);
		
		System.out.printf("%s : %s\n\n", sender.name, message);
	}
	
}



public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Message ob1 = new Message("짱구");
		Message ob2 = new Message("철수");
		
		ob1.sendMessage(ob2, "철수야 안녕");
		// ob1이 this로 받아진다 
		ob2.sendMessage(ob1, "짱구야 안녕");
		
	}

}
