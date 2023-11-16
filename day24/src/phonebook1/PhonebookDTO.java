package phonebook1;

public class PhonebookDTO {
	
	
//	CREATE TABLE phonebook (
//	        name    VARCHAR2(100),      -- 가변길이문자열 최대 100바이트
//	        pnum    VARCHAR2(20),       -- 오라클에서 한들은 1글자에 3바이트(varchar2)
//	        age     NUMBER,             -- 정수 및 실수
//	        favroite CHAR(1)            -- 고정길이 문자열, Y or N
//	    );
	
	private String name;				// 이름
	private String pnum;				// 전화번호
	private int age;					// 나이
	
	private String favorite;			// 줄겨찾기 (Y혹은 N으로만 넣을 수있음)
	
	
	@Override
	public String toString() {
		
		String form = "%s %13s %s %s";
		form = String.format(form, name, pnum,age, (favorite.equals("Y") ? "O" : "X"));
		// TODO Auto-generated method stub
		return form;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPnum() {
		return pnum;
	}

	public void setPnum(String pnum) {
		this.pnum = pnum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFavorite() {
		return favorite;
	}

	public void setFavorite(String favorite) {
		this.favorite = favorite;
	}
	
}
