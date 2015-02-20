package io.employee.dao;

import java.sql.SQLException;
import java.util.Map;

public interface AdminMasterDao {

	public int insertEmployee(Map<String, Object> map) throws SQLException;
	public int deleteEmployeeById(Map<String, Object> map) throws SQLException;

}