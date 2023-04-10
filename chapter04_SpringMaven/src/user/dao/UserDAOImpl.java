package user.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcDaoSupport;
import org.springframework.stereotype.Repository;

import user.bean.UserDTO;

@Repository
public class UserDAOImpl extends NamedParameterJdbcDaoSupport implements UserDAO {
	@Autowired
	public void setDS(DataSource dataSource) {
		setDataSource(dataSource); //JdbcDaoSupport에 있는 setDataSource() 메소드를 호출
	}

	@Override
	public void write(UserDTO userDTO) {
		String sql = "insert into usertable values(:name, :id, :pwd)";
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("name", userDTO.getName());
		map.put("id", userDTO.getId());
		map.put("pwd", userDTO.getPwd());
		
		getNamedParameterJdbcTemplate().update(sql, map);
		
	}

	@Override
	public List<UserDTO> getUserList() {
		String sql = "select * from usertable";
		return getJdbcTemplate().query(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class));
	}
	
	@Override
	public UserDTO getUser(String id) {
		String sql = "select * from usertable where id=?";
		try {
		return getJdbcTemplate().queryForObject(sql, new BeanPropertyRowMapper<UserDTO>(UserDTO.class), id);
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
	}																		
	
    @Override
    public void update(Map<String, String> map) {
       String sql = "update usertable set name = :name, pwd = :pwd where id = :id";
       getNamedParameterJdbcTemplate().update(sql, map);
    }

	@Override
	public void delete(String id) {
		String sql = "delete from usertable where id = :id";
		getJdbcTemplate().update(sql, id);
	}
	
    


}










