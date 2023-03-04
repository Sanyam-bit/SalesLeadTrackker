package com.pro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pro.pojos.Manager;

public interface ManagerRepository extends JpaRepository<Manager, Long> {

	Manager saveAll(Manager transientmanager);

	
}
