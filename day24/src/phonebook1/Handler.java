package phonebook1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Handler {
	
	
	private PhonebookDAO dao = new PhonebookDAO();
	
	public List<PhonebookDTO> selectList() {
		String sql = "select * from phonebook order by favorite desc, name";
		RowMapper<PhonebookDTO> mapper  = (rs) -> {
			PhonebookDTO dto = new PhonebookDTO();
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			
			return dto;
		};
		
	}
	
	
	
		
	public void showList() {
		
		JdbcTemplate template = new JdbcTemplate();
		
		String sql = "select * from phonebook";
		
	
		
		RowMapper<PhonebookDTO> mapper = (rs) -> {
			PhonebookDTO dto = new PhonebookDTO();
			
			dto.setName(rs.getString("name"));
			dto.setPnum(rs.getString("pnum"));
			dto.setAge(rs.getInt("age"));
			dto.setFavorite(rs.getString("favorite"));
			
			return dto;
			
		};
		
		List<PhonebookDTO> list = template.queryForList(sql, mapper);
		
		
		for (PhonebookDTO ob : list) {
			System.out.printf("이름 :%s,전화번호 : %s,나이 : %d \t 즐겨찾기 : %s\n",
				ob.getName(),
				ob.getPnum(),
				ob.getAge(),
				ob.getFavorite());
		}
		System.out.println("끝");
	}
	

	public int insert(PhonebookDTO dto ) {
		
		
		JdbcTemplate template = new JdbcTemplate();
		
		String sql = "insert into phonebook values(?, ?, ?, ?)";
		int row = template.update(sql, dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite() );
		System.out.println("결과" + row);
		
		
		return row;
	}
	
	
	
	
//	public int delete(String name) {
//		int row = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("삭제할 사람의 이름 입력 :");
//		name = sc.nextLine();
//		
//		JdbcTemplate template = new JdbcTemplate();
//		String sql = "delete form phonebook where name = ?";
//		
//		row = template.update(sql, name);
//		
//		System.out.printf("%d행이 삭제\n", row);
//		
//		sc.close();
//		return row;
//	}


	public void updatePnum(PhonebookDTO dto) {
		// TODO Auto-generated method stub
		int row = 0;
		
		String sql = "update phonebook set name = ?  where pnum = ?";
		JdbcTemplate template = new JdbcTemplate();
		Scanner sc = new Scanner(System.in);
		String name, pnum;
		
		System.out.println("전화번호 바꿀 이름 입력 :");
		name = sc.nextLine();
		
		System.out.println("변경할 전화번호");
		pnum = sc.nextLine();
		
		
		
		row = template.update(sql,  name, pnum);
		System.out.println(row + "전화번호 수정 완료");
		sc.close();
		return;
	}


//	public int updateFavorite(String name) {
//		// TODO Auto-generated method stub
//		int row = 0;
//		JdbcTemplate template = new JdbcTemplate();
//		String sql = "update phonebook set name =? where favorite";
//		Scanner sc = new Scanner(System.in);
//		
//		
//		String favorite;
//		System.out.println("즐겨찾기 변경할 이름 입력 :");
//		name = sc.nextLine();
//		
//		System.out.println("즐겨찾기 변경");
//		favorite = 
//		
//		return row;
//	}




	




	public int insertPhonebook(PhonebookDTO dto) {
		// TODO Auto-generated method stub
		int row = dao.insert(dto);
		return 0;
	}




	public int updatePnum(String name, String pnum) {
		// TODO Auto-generated method stub
		PhonebookDTO dto = new PhonebookDTO();
		dto.setName(name);
		dto.setPnum(pnum);
		int row = dao.updatePnum(dto);
		return row;
	}




	public int updateFavorite(String name) {
		int row = dao.updateFavorite(name);
		// TODO Auto-generated method stub
		return row;
	}




	public int delete(String name) {
		// TODO Auto-generated method stub
		int row = dao.delete(name);
		
		
		return row;
	}




	
	
	
}
