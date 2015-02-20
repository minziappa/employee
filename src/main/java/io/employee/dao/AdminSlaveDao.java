package io.employee.dao;

import io.employee.bean.model.admin.ManagementAdmin;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface AdminSlaveDao {

	public ManagementAdmin selectAdmin(Map<String, Object> map) throws SQLException;
	public List<ManagementAdmin> selectAdminList(Map<String, Object> map) throws SQLException;

}