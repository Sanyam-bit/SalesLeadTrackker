package com.pro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.pojos.Manager;

@RestController
@RequestMapping("/managers")
public class ManagerController {
	
	@Autowired
	private Manager managerService;
	
	public ManagerController() {
		System.out.println("in def ctor " + getClass());
	}

	
	@GetMapping
	public List<Manager>getAllmanager() {
		System.out.println("in get all manager");
		return managerService.getAllmanagerDetails();
}
	@PostMapping
	public Manager savemanagerDetails(@RequestBody Manager transientmanager)
	{
		System.out.println("in save manager "+transientmanager+" id "+transientmanager.getId());//
		return managerService.addmanagerDetails(transientmanager);
		 
	}
		
	@DeleteMapping("/{managerId}")
	public Manager deletemanagerDetails(@PathVariable Long managerId)
	{
		System.out.println("in del manager "+managerId);
		return managerService.deletemanagerDetails(managerId);
	}
}
