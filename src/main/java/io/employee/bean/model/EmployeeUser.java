package io.employee.bean.model;

import java.io.Serializable;
import java.util.Date;

public class EmployeeUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private long userNum;
	private String userId;
	private String userCode;
	private String userPwd;
	private String userNameFirst;
	private String userNameLast;
	private String userSex;
	private String userAge;
	private String userBirth;
	private String userBloodType;
	private String userMarried;
	private String userTelephoneNumber;
	private String userCellphoneNumber;
	private String userAddress;
	private String userBirthPlace;
	private String userResidentNumber;
	private String userStatus;
	private byte[] userSmallImg;
	private byte[] userBigImg;
	private String deleteFlag;
	private Date insertDate;
	private Date updateDate;

	public long getUserNum() {
		return userNum;
	}
	public void setUserNum(long userNum) {
		this.userNum = userNum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserNameFirst() {
		return userNameFirst;
	}
	public void setUserNameFirst(String userNameFirst) {
		this.userNameFirst = userNameFirst;
	}
	public String getUserNameLast() {
		return userNameLast;
	}
	public void setUserNameLast(String userNameLast) {
		this.userNameLast = userNameLast;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public String getUserBirth() {
		return userBirth;
	}
	public void setUserBirth(String userBirth) {
		this.userBirth = userBirth;
	}
	public String getUserBloodType() {
		return userBloodType;
	}
	public void setUserBloodType(String userBloodType) {
		this.userBloodType = userBloodType;
	}
	public String getUserMarried() {
		return userMarried;
	}
	public void setUserMarried(String userMarried) {
		this.userMarried = userMarried;
	}
	public String getUserTelephoneNumber() {
		return userTelephoneNumber;
	}
	public void setUserTelephoneNumber(String userTelephoneNumber) {
		this.userTelephoneNumber = userTelephoneNumber;
	}
	public String getUserCellphoneNumber() {
		return userCellphoneNumber;
	}
	public void setUserCellphoneNumber(String userCellphoneNumber) {
		this.userCellphoneNumber = userCellphoneNumber;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserBirthPlace() {
		return userBirthPlace;
	}
	public void setUserBirthPlace(String userBirthPlace) {
		this.userBirthPlace = userBirthPlace;
	}
	public String getUserResidentNumber() {
		return userResidentNumber;
	}
	public void setUserResidentNumber(String userResidentNumber) {
		this.userResidentNumber = userResidentNumber;
	}
	public String getUserStatus() {
		return userStatus;
	}
	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}
	public byte[] getUserSmallImg() {
		return userSmallImg;
	}
	public void setUserSmallImg(byte[] userSmallImg) {
		this.userSmallImg = userSmallImg;
	}
	public byte[] getUserBigImg() {
		return userBigImg;
	}
	public void setUserBigImg(byte[] userBigImg) {
		this.userBigImg = userBigImg;
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
