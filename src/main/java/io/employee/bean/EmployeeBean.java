package io.employee.bean;

import io.employee.bean.model.admin.ManagementAdmin;

import java.io.Serializable;

public class EmployeeBean implements Serializable {

	private static final long serialVersionUID = -2758511412673492544L;

	private ManagementAdmin managementAdmin;
	private String userImage;

	public ManagementAdmin getManagementAdmin() {
		return managementAdmin;
	}
	public void setManagementAdmin(ManagementAdmin managementAdmin) {
		this.managementAdmin = managementAdmin;
	}
	public String getUserImage() {
		return userImage;
	}
	public void setUserImage(String userImage) {
		this.userImage = userImage;
	}


}