package com.ims.dao;

public interface UserDao {
	void addUser();
	boolean verifyUnameAndPwd(String email, String pass);
	String forgotPassword(String email);
}
