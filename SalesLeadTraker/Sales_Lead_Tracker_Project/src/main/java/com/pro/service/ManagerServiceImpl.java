package com.pro.service;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;

import com.pro.pojos.Manager;
import com.pro.repository.ManagerRepository;

public class ManagerServiceImpl implements ManagerService {

	
	@Autowired
	private ManagerRepository managerRepo;
	//dep : model mapper 
	@Autowired
	private ModelMap mapper;
	
	@PostConstruct
	public void init()
	{
		System.out.println("in init "+mapper);
	}

	
	@Override
	public List<Manager> getAllmanagerDetails() {
		return managerRepo.findAll();
	}
	@Override
	public Manager addmanagerDetails(Manager transientmanager) {
		return managerRepo.saveAll(transientmanager);
}
	@Override
	public String deletemanagerDetails(Long managerId) {
		// chekc if manager exists by id
		if (managerRepo.existsById(managerId)) {
			managerRepo.deleteById(managerId);
			return "manager details deleted ....";
		}
		return "manager Failed : Invalid manager Id !!!!!!!!!!!";
	}
}
