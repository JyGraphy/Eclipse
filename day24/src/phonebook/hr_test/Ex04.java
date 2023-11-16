package hr_test;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		countries 테이블에 insert 하기
		
		JdbcTemplate template = new JdbcTemplate();
		
		String sql  = "insert into countries values (?, ?, ?)"; // sql 구문
		
		int row = template.update(sql, "KR", "South Korea", 3); // 위에 구문에 추가할 구문 작성
		
		System.out.println("결과" + row);	// 성공 시 1 반환
		
		// 한 번 성공후 다시 실행시 예외 발생 (국가 코드의 중복) 무결성 제약 조건의 위배로 인한 예외 발생
//		java.sql.SQLIntegrityConstraintViolationException: ORA-00001: 
//			무결성 제약 조건(HR.COUNTRY_C_ID_PK)에 위배됩니다
	}

}
