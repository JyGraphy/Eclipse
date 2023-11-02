package accessModifier;


class Test1 {
	private int n1 = 10;
	int n2 = 20;
	protected int n3 = 30;
	public int n4 = 40;		// 다른 패키지에 있는 상속관계 클래스 간의 접근 허용 (상속관계가 아니면 구지 사용할 일이 없다)
	public int getN1( ) {
		return n1; 			// private 필드라도, 클래스 내부에서는 자유롭게 접근이 가능하다
	}
	// getter의 필요성이 가장 큰 접근제한자는 private이다
	
	
}


public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generateTd method stub
		
		Test1 ob = new Test1();
		
//		System.out.println("ob.n1 : " + ob.n1);
//		The field Test1.n1 is not visible
		System.out.println("ob.n1 : " + ob.getN1());
		
		System.out.println("ob.n2 : " + ob.n2);
		System.out.println("ob.n3 : " + ob.n3);
		System.out.println("ob.n4 : " + ob.n4);

	}

}
