package com.pro.service;

import java.util.List;

import com.pro.pojos.Manager;

public interface ManagerService {
	List<Manager> getAllmanagerDetails();
	
	public Manager addmanagerDetails(Manager transientManager);
	
	String deletemanagerDetails(Long managerId);
}

