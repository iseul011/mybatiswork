package com.study.mybatis.member.vo;

public class Member {
	
	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	private String birthday;
	private String gender;
	private String phone;
	private String address;
	private String enrolldate;
	private String modifydate;
	private String status;
	
	public Member() {	}

	public Member(String userId, String userPwd, String userName, String email, String birthday, String gender,
			String phone, String address, String enrolldate, String modifydate, String status) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.birthday = birthday;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.enrolldate = enrolldate;
		this.modifydate = modifydate;
		this.status = status;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEnrolldate() {
		return enrolldate;
	}

	public void setEnrolldate(String enrolldate) {
		this.enrolldate = enrolldate;
	}

	public String getModifydate() {
		return modifydate;
	}

	public void setModifydate(String modifydate) {
		this.modifydate = modifydate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Member [userId=" + userId + ", userPwd=" + userPwd + ", userName=" + userName + ", email=" + email
				+ ", birthday=" + birthday + ", gender=" + gender + ", phone=" + phone + ", address=" + address
				+ ", enrolldate=" + enrolldate + ", modifydate=" + modifydate + ", status=" + status + "]";
	}
	
}
