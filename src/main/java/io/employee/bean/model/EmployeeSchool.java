package io.employee.bean.model;

import java.util.Date;

public class EmployeeSchool {

	private long schoolNum;
	private String schoolCode;
	private String schoolName;
	private String schoolPlace;
	private Date schoolEntranceDate;
	private Date schoolGraduationDate;
	private String schoolMainMajor;
	private String schoolSubMajor;
	private String schoolPeriod;
	private String schoolStatus;
	private long userNum;
	private String deleteFlag;
	private Date insertDate;
	private Date updateDate;

	public long getSchoolNum() {
		return schoolNum;
	}
	public void setSchoolNum(long schoolNum) {
		this.schoolNum = schoolNum;
	}
	public String getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(String schoolCode) {
		this.schoolCode = schoolCode;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public String getSchoolPlace() {
		return schoolPlace;
	}
	public void setSchoolPlace(String schoolPlace) {
		this.schoolPlace = schoolPlace;
	}
	public Date getSchoolEntranceDate() {
		return schoolEntranceDate;
	}
	public void setSchoolEntranceDate(Date schoolEntranceDate) {
		this.schoolEntranceDate = schoolEntranceDate;
	}
	public Date getSchoolGraduationDate() {
		return schoolGraduationDate;
	}
	public void setSchoolGraduationDate(Date schoolGraduationDate) {
		this.schoolGraduationDate = schoolGraduationDate;
	}
	public String getSchoolMainMajor() {
		return schoolMainMajor;
	}
	public void setSchoolMainMajor(String schoolMainMajor) {
		this.schoolMainMajor = schoolMainMajor;
	}
	public String getSchoolSubMajor() {
		return schoolSubMajor;
	}
	public void setSchoolSubMajor(String schoolSubMajor) {
		this.schoolSubMajor = schoolSubMajor;
	}
	public String getSchoolPeriod() {
		return schoolPeriod;
	}
	public void setSchoolPeriod(String schoolPeriod) {
		this.schoolPeriod = schoolPeriod;
	}
	public String getSchoolStatus() {
		return schoolStatus;
	}
	public void setSchoolStatus(String schoolStatus) {
		this.schoolStatus = schoolStatus;
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
