package com.ims.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.ims.dao.InsuranceDao;
import com.ims.model.Insurance;

public class InsuranceDaoImpl implements InsuranceDao {

	Scanner sc = new Scanner(System.in);
	
	
	public static List <Insurance> addInsurances = new ArrayList();
	
	@Override
	public void addInsurance() {
		
		// TODO Auto-generated method stub
		 int k = 1;
		 
		 while (k == 1) 
		 {
			 System.out.println("Enter Insurance ID:");
			 int iid = sc.nextInt();
			 
			 System.out.println("Enter Insurance Name (eg: Home, Renter):");
			 String iname = sc.next();
			 
			 System.out.println("Enter Insurance price:");
			 double iprice = sc.nextDouble();
			 
			 System.out.println("Enter Insurance Tier (Gold/Silver):");
			 String itype = sc.next();
			 
			 Insurance i = new Insurance(iid, iname, iprice, itype);
			 
			 addInsurances.add(i);
			 System.out.println("Sucessfully added");

			 System.out.println("Do you want to add more Insurance? 1) Yes 2) No");
			 k = sc.nextInt();
		 }

	}

	@Override
	public List<Insurance> viewAllInsurances() {
		// TODO Auto-generated method stub
		return addInsurances;
	}

	@Override
	public Insurance viewInsurnace(int iid) {
		// TODO Auto-generated method stub
		for (Insurance i : addInsurances)
		{
			if (i.getInsuranceId() == iid)
				return i;
			
			 	
		}
		return null;
	}

	@Override
	public int updateInusrance(int iid) {
		// TODO Auto-generated method stub
		for (Insurance i : addInsurances) {
	        if (i.getInsuranceId() == iid) {
	            System.out.println("Enter new name:");
	            String newName = sc.next();
	            System.out.println("Enter new price:");
	            double newPrice = sc.nextDouble();
	            System.out.println("Enter new type:");
	            String newType = sc.next();
	            
	            i.setInsuranceName(newName);
	            i.setInsurancePrice(newPrice);
	            i.setInsuranceType(newType);
	            return 1; // Successful update
	        }
	    }
		return 0;
	}

	@Override
	public boolean deleteInsurance(int iid) {
	    Iterator<Insurance> iterator = addInsurances.iterator();
	    while (iterator.hasNext()) {
	        Insurance i = iterator.next();
	        if (i.getInsuranceId() == iid) {
	            iterator.remove();
	            return true;
	        }
	    }
	    return false;
	}

//	public boolean deleteInsurance(int iid) {
//		// TODO Auto-generated method stub
//		boolean flag = false;
//		for (Insurance i : addInsurances)
//		{
//			if (i.getInsuranceId() == iid)
//			{
//				addInsurances.remove(i);
//				flag = true;
//			}
//		}
//		return flag;
//	}

}
