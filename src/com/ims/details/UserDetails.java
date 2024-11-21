//package com.ims.details;
//
//import java.util.List;
//import java.util.Scanner;
//
//import com.ims.dao.impl.InsuranceDaoImpl;
//import com.ims.model.Insurance;
//
//
//public class UserDetails {
//	Scanner sc = new Scanner(System.in);
//	InsuranceDaoImpl daoImpl = new InsuranceDaoImpl();
//	
//	public void userMenu(){
//		
//
//		while(true)
//		{
//	
//		System.out.println("============================================");
//		
//		System.out.println("			1) ViewMyInsurance				    ");		
//		System.out.println("			2) ViewAllInsurances				");		
//	
//		System.out.println("			3) UpgradeExistingInsurance		    ");	
//		System.out.println("			4) RemoveInsurance				    ");		
//	
//		System.out.println("			5) Back	    			");		
//	
//	
//		System.out.println("============================================");
//		
//		System.out.println("Enter your choice");
//		int choice = sc.nextInt();
//		
//		
//		switch(choice)
//		{
//		case 1:
//			System.out.println("Enter Insurance id:");
//			int viewId = sc.nextInt();
//			Insurance insId = daoImpl.viewInsurnace(viewId);
//			if (insId != null)
//				System.out.println(insId.getInsuranceId() + "/t" + insId.getInsuranceName()+ "/t" + insId.getInsurancePrice() + "/t" + insId.getInsuranceType());
//			else
//				System.out.print("Stock does not exist");
//			
//			break;
//			
//		case 2:
//			List <Insurance> viewInsurances = daoImpl.viewAllInsurances();
//			for ( Insurance i : viewInsurances)
//				System.out.println(i.getInsuranceId() + "/t" + i.getInsuranceName()+ "/t" + i.getInsurancePrice() + "/t" + i.getInsuranceType());
//			break;
//			
//		case 3:
//			System.out.println("Enter Insurance id:");
//			int updateId = sc.nextInt();
//			int uid = daoImpl.updateInusrance(updateId);
//			if (uid != 0)
//				System.out.println("Updated");
//			else
//				System.out.print("Stock does not exist");
//			break;
//			
//		case 4:
//			
//			System.out.println("Enter Insurance id:");
//			int delId = sc.nextInt();
//			boolean delIns = daoImpl.deleteInsurance(delId);
//			if (delIns)
//				System.out.println("Sucessful");
//			else
//				System.out.print("Stock does not exist");
//			break;
//			
//		case 5:
//			
//			break;
//			
//			
//		default:
//			System.out.print("Choose between 1 to 6");
//		}
//	}
//	
//	}
//}
//
