package com.theplayer.kits.vo;

// Access Modifier
// public -> method : priorities
// (default)
// protected : family
// private -> field : priorities


// Lombok, @Getter
public class LoginUser {
	
	private String userId;
	private String userPw;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	
}
