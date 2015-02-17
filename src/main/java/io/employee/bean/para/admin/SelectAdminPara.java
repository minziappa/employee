package io.employee.bean.para.admin;

import io.paging.bean.PagingPara;

public class SelectAdminPara extends PagingPara {

	private String userName;

    private String userData;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserData() {
		return userData;
	}

	public void setUserData(String userData) {
		this.userData = userData;
	}

}