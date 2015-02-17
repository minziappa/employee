package io.employee.bean.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeCompany implements Serializable {

	private static final long serialVersionUID = 1L;

	private long companyNum;
	private String companyCode;
	private String companyName;
	private String companyBranch;
	private String companyDivision;
	private String companyTeam;
	private String companyGroup;
	private String companyTelephoneNumber;
	private String companyCellphoneNumber;
	private String companyOccupationType;
	private String companyHireType;
	private Date companyHireDate;
	private Date companyQuitDate;
	private String companyQuitReason;
	private String userNum;
	private String deleteFlag;
	private Date insertDate;
	private Date updateDate;

	public long getCompanyNum() {
		return companyNum;
	}
	public void setCompanyNum(long companyNum) {
		this.companyNum = companyNum;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyBranch() {
		return companyBranch;
	}
	public void setCompanyBranch(String companyBranch) {
		this.companyBranch = companyBranch;
	}
	public String getCompanyDivision() {
		return companyDivision;
	}
	public void setCompanyDivision(String companyDivision) {
		this.companyDivision = companyDivision;
	}
	public String getCompanyTeam() {
		return companyTeam;
	}
	public void setCompanyTeam(String companyTeam) {
		this.companyTeam = companyTeam;
	}
	public String getCompanyGroup() {
		return companyGroup;
	}
	public void setCompanyGroup(String companyGroup) {
		this.companyGroup = companyGroup;
	}
	public String getCompanyTelephoneNumber() {
		return companyTelephoneNumber;
	}
	public void setCompanyTelephoneNumber(String companyTelephoneNumber) {
		this.companyTelephoneNumber = companyTelephoneNumber;
	}
	public String getCompanyCellphoneNumber() {
		return companyCellphoneNumber;
	}
	public void setCompanyCellphoneNumber(String companyCellphoneNumber) {
		this.companyCellphoneNumber = companyCellphoneNumber;
	}
	public String getCompanyOccupationType() {
		return companyOccupationType;
	}
	public void setCompanyOccupationType(String companyOccupationType) {
		this.companyOccupationType = companyOccupationType;
	}
	public String getCompanyHireType() {
		return companyHireType;
	}
	public void setCompanyHireType(String companyHireType) {
		this.companyHireType = companyHireType;
	}
	public Date getCompanyHireDate() {
		return companyHireDate;
	}
	public void setCompanyHireDate(Date companyHireDate) {
		this.companyHireDate = companyHireDate;
	}
	public Date getCompanyQuitDate() {
		return companyQuitDate;
	}
	public void setCompanyQuitDate(Date companyQuitDate) {
		this.companyQuitDate = companyQuitDate;
	}
	public String getCompanyQuitReason() {
		return companyQuitReason;
	}
	public void setCompanyQuitReason(String companyQuitReason) {
		this.companyQuitReason = companyQuitReason;
	}
	public String getUserNum() {
		return userNum;
	}
	public void setUserNum(String userNum) {
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
