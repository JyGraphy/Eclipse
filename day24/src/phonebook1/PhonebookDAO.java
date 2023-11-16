package phonebook1;


public class PhonebookDAO {
	
//	SQL과 다른 인자만전달하면 쿼리를 수행, 결과를 돌려주는 객체(도구)
	private JdbcTemplate template = new JdbcTemplate();

	public int insert(PhonebookDTO dto) {
		// TODO Auto-generated method stub
		String sql = "insert into phonebook values (?, ?, ?, ?)";
		Object[] agrs = {dto.getName(), dto.getPnum(), dto.getAge(), dto.getFavorite()};
		int row = template.update(sql, agrs);
		return row;
		
	}

	public int updatePnum(PhonebookDTO dto) {
		// TODO Auto-generated method stub
		String sql = "update phonebook set pnum =? where name = ?";
		
		Object[] ages = {dto.getPnum(), dto.getName()};
		int row = template.update(sql, ages);
		
		
		return row;
	}

	public int updateFavorite(String name) {
		String sql = "update phonebook set favorite = decode(favorite, 'Y', 'N', 'N', 'Y') where name = ?";
		// TODO Auto-generated method stub
		int row = template.update(sql, name);
		return 0;
	}

	public int delete(String name) {
		// TODO Auto-generated method stub
		String sql = "delete from phonebook where name = ?";
		int row = template.update(sql, name);
		
		return 0;
	}

	
}
