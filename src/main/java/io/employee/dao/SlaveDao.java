package io.employee.dao;


import io.employee.bean.model.EmployeeUser;

import java.sql.SQLException;
import java.util.Map;

public interface SlaveDao {

	public EmployeeUser selectEmployeeUser(Map<String, Object> map) throws SQLException;

}