package io.employee.service;

import java.util.List;

import io.employee.bean.model.EmployeeUser;
import io.employee.bean.model.EmployeeUserTemp;
import io.employee.bean.para.SelectUserPara;

public interface UserService {

	public int getEmployeeUserSum() throws Exception;
	public EmployeeUser selectEmployeeUser(String name) throws Exception;
	public EmployeeUserTemp selectEmployeeUserTemp(String userTempEmail) throws Exception;
	public List<EmployeeUser> selectEmployeeUserList(SelectUserPara selectUserPara) throws Exception;

}