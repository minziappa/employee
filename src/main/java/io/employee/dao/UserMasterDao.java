package io.employee.dao;

import java.sql.SQLException;
import java.util.Map;

public interface UserMasterDao {

	public long updateSequeceUserTemp(Map<String, Object> map) throws SQLException;
	public long updateSequeceUser(Map<String, Object> map) throws SQLException;
	public int insertUserTemp(Map<String, Object> map) throws SQLException;

}