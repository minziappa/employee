package io.employee.service;

import java.util.List;

import io.employee.bean.model.EmployeeUser;
import io.employee.bean.para.InsertUserPara;
import io.employee.bean.para.admin.SelectAdminPara;

public interface EmployeeService {

	public boolean insertEmployeeUser(InsertUserPara insertUserPara) throws Exception;

	public int getEmployeeUserSum() throws Exception;
	public EmployeeUser selectEmployeeUser(String name) throws Exception;
	public List<EmployeeUser> selectEmployeeUserList(SelectAdminPara selectAdminPara) throws Exception;

}