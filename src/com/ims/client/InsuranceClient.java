package com.ims.client;

import java.util.Scanner;

import com.ims.details.InsuranceDetails;


public class InsuranceClient {

	public static void main(String[] args) {
		InsuranceDetails details = new InsuranceDetails();
		Scanner sc = new Scanner(System.in);

		System.out.println("====================================================");
		System.out.println("                 Property Insurances				");

		System.out.println(" 					1) Login						");
//		System.out.println(" 					2) Register						");
		System.out.println(" 					2) Exit							");

		System.out.println("====================================================");

		
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		
		
		
		switch(choice)
		{
		case 1:
			System.out.println("Enter User Name: ");
			String uname = sc.next();
			
			System.out.println("Enter Password: ");
			String pass = sc.next();
			
			if(uname.equals("admin") && pass.equals("admin@123"))
			{
				details.adminInsuranceMenu();
				break;
				
			}
			else if(uname.equals("sudipa") && pass.equals("sudipa@123"))
			{
				details.userInsuranceMenu();
				break;
				
			}
			else 
				System.out.println("Invalid");
			break;
			
			
		case 2:
			break;
			
		case 3:
			System.out.println("Thanks for using this app");
			System.exit(0);
			
			
		default:
			System.out.println("Choose 1 to 3");
		
		
		}
	}

}


