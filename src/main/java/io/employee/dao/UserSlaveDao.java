package io.employee.dao;

import io.employee.bean.model.EmployeeUser;
import io.employee.bean.model.EmployeeUserTemp;

import java.sql.SQLException;
import java.util.Map;

public interface UserSlaveDao {

	public EmployeeUser selectUser(Map<String, Object> map) throws SQLException;
	public EmployeeUserTemp selectUserTemp(Map<String, Object> map) throws SQLException;

}