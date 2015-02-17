package io.employee.bean.model;

import java.io.Serializable;
import java.util.List;

import io.employee.bean.EmployeeBean;
import io.paging.bean.PagingBean;

public class EmployeeModel implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private EmployeeBean employee;
	private List<EmployeeBean> employeeList;
	private EmployeeUser employeeUser;
	private String filePath;
	private String navi;
	/** Paging **/
    private PagingBean paging;
    /** Show the message to page.**/
    private String errorMessage;

	public EmployeeBean getEmployee() {
		return employee;
	}
	public void setEmployee(EmployeeBean employee) {
		this.employee = employee;
	}
	public List<EmployeeBean> getEmployeeList() {
		return employeeList;
	}
	public void setEmployeeList(List<EmployeeBean> employeeList) {
		this.employeeList = employeeList;
	}
	public EmployeeUser getEmployeeUser() {
		return employeeUser;
	}
	public void setEmployeeUser(EmployeeUser employeeUser) {
		this.employeeUser = employeeUser;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getNavi() {
		return navi;
	}
	public void setNavi(String navi) {
		this.navi = navi;
	}
	public PagingBean getPaging() {
		return paging;
	}
	public void setPaging(PagingBean paging) {
		this.paging = paging;
	}
	public String getErrorMessage() {
		return errorMessage;
	}
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}


}
