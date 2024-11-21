package com.ims.dao;

import java.util.List;

import com.ims.model.Insurance;

public interface InsuranceDao {

	void addInsurance();
	List <Insurance> viewAllInsurances();
	Insurance viewInsurnace(int iid);
	int updateInusrance(int iid);
	boolean deleteInsurance(int iid);
}
