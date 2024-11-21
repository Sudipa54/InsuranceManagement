package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.UserDao;
import com.ims.model.User;

public class UserDaoImpl implements UserDao {
	
	Scanner sc = new Scanner(System.in);
	public static List <User> addUsers = new ArrayList();

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter user id:");
		int uid = sc.nextInt();
		
		System.out.println("Enter firstName");
		String fname = sc.next();
		
		System.out.println("Enter lastName");
		String lname = sc.next();
		
		System.out.println("Enter email");
		String email = sc.next();
		
		System.out.println("Enter phone number");
		double phNumber = sc.nextDouble();
		
		System.out.println("Enter user name ");
		String uname = sc.next();
		
		System.out.println("Enter password:");
		String pwd = sc.next();
		
		User u = new User();
		
		addUsers.add(u);
		

	}

	@Override
	public boolean verifyUnameAndPwd(String email, String pass) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String forgotPassword(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
