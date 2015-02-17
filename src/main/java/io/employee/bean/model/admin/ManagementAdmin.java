package io.employee.bean.model.admin;

import java.io.Serializable;
import java.util.Date;

public class ManagementAdmin implements Serializable {
	
	private static final long serialVersionUID = 1L;

	private long AdminId;
	private String AdminName;
	private String adminPwd;
	private String AdminStatus;
	private long UserNum;
	private String DeleteFlag;
	private Date InsertDate;
	private Date UpdateDate;

	public long getAdminId() {
		return AdminId;
	}
	public void setAdminId(long adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPwd() {
		return adminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		this.adminPwd = adminPwd;
	}
	public String getAdminStatus() {
		return AdminStatus;
	}
	public void setAdminStatus(String adminStatus) {
		AdminStatus = adminStatus;
	}
	public long getUserNum() {
		return UserNum;
	}
	public void setUserNum(long userNum) {
		UserNum = userNum;
	}
	public String getDeleteFlag() {
		return DeleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		DeleteFlag = deleteFlag;
	}
	public Date getInsertDate() {
		return InsertDate;
	}
	public void setInsertDate(Date insertDate) {
		InsertDate = insertDate;
	}
	public Date getUpdateDate() {
		return UpdateDate;
	}
	public void setUpdateDate(Date updateDate) {
		UpdateDate = updateDate;
	}

}