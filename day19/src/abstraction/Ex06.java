package abstraction;


interface Test6 {
//	인터페이스는 추상클래스의 일종이다 일반적인 추상 클래스와 달리 메스드를 포함할 수 없다
//	extends 대신 implements 키워드로 상속(구현)한다
//	모든 필드는 public static final 속성을 가진다
//	모든 메서드는 public abstract 속성을 가진다
//	다중 상속을 허용한다
//	예외사항이 많다
	
	String name = "테스트 인터페이스";
//	String abstraction.Test6.name : "테스트 인터페이스"
	
	void f1();
//		Abstract methods do not specify a body
//		추상 메서드는 body를 지정할 수 없습니다
	
//	protected void f2( ) 
//		Illegal modifier for the interface method f2; 
//		only public, private, abstract, default, static and strictfp are permitted
//		잘못된 식별자가 f2에 지정되었습니다
//		오로지  public, private, abstract, default, static and strictfp 만 허용
		
		private void f2() {
//			The method f2() from the type Test6 is never used locally
//			내부에서만 호추가능한 함수
			
			
		}
		
		public abstract void f3();	// 메서드만 작성했을떄의 기본형
	
	
	
	
}


public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		인터파크 : 
//		인터페이스 : 서로 다른 유형의 객체를 같은 규격(표면, face)로 마주기 위한 형태, 도구 
//		인터넷 : 통신망을 하나로 연결한 인터네트워크라는 말에서 시작되었다
		
		
	}

}
