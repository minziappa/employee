package io.employee.service;

import java.util.List;

import io.employee.bean.model.admin.ManagementAdmin;
import io.employee.bean.para.InsertUserPara;
import io.employee.bean.para.admin.SelectAdminPara;

public interface AdminService {

	public boolean insertemployee(InsertUserPara insertUserPara) throws Exception;
	
	public int getAdminSum() throws Exception;
	public ManagementAdmin selectemployeeByName(String name) throws Exception;
	public List<ManagementAdmin> selectAdminList(SelectAdminPara selectAdminPara) throws Exception;

}