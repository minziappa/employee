package io.employee.bean.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeCertificate implements Serializable {

	private static final long serialVersionUID = 1L;

	private long certificateNum;
	private String certificateName;
	private String certificateNation;
	private Date certificateGetDate;
	private Date certificateExpireDate;
	private Date certificateUpdateDate;
	private long userNum;
	private String deleteFlag;
	private Date insertDate;
	private Date updateDate;

	public long getCertificateNum() {
		return certificateNum;
	}
	public void setCertificateNum(long certificateNum) {
		this.certificateNum = certificateNum;
	}
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	public String getCertificateNation() {
		return certificateNation;
	}
	public void setCertificateNation(String certificateNation) {
		this.certificateNation = certificateNation;
	}
	public Date getCertificateGetDate() {
		return certificateGetDate;
	}
	public void setCertificateGetDate(Date certificateGetDate) {
		this.certificateGetDate = certificateGetDate;
	}
	public Date getCertificateExpireDate() {
		return certificateExpireDate;
	}
	public void setCertificateExpireDate(Date certificateExpireDate) {
		this.certificateExpireDate = certificateExpireDate;
	}
	public Date getCertificateUpdateDate() {
		return certificateUpdateDate;
	}
	public void setCertificateUpdateDate(Date certificateUpdateDate) {
		this.certificateUpdateDate = certificateUpdateDate;
	}
	public long getUserNum() {
		return userNum;
	}
	public void setUserNum(long userNum) {
		this.userNum = userNum;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
	public Date getInsertDate() {
		return insertDate;
	}
	public void setInsertDate(Date insertDate) {
		this.insertDate = insertDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
