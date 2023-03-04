package com.pro.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="managers")
public class Manager {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="manager_id")
	private int id;
	
	@Column(name="first_name",length = 30)
	private String firstname;
	
	@Column(name="last_name",length = 20)
	private String lastName;
	
	@Column(name="manager_email",length = 30,nullable=false)
	private String email;
	
	@Column(name="manager_pass")
	private String password;

	public List<TeamLeader> getTeamleader() {
		return teamleader;
	}


	public void setTeamleader(List<TeamLeader> teamleader) {
		this.teamleader = teamleader;
	}


	public List<SalesAgents> getSalesagents() {
		return salesagents;
	}


	public void setSalesagents(List<SalesAgents> salesagents) {
		this.salesagents = salesagents;
	}


	public List<Leads> getLeads() {
		return leads;
	}


	public void setLeads(List<Leads> leads) {
		this.leads = leads;
	}

	@OneToMany(mappedBy ="manager",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<TeamLeader>teamleader=new ArrayList<TeamLeader>();
	
	@OneToMany(mappedBy ="manager1",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<SalesAgents>salesagents=new ArrayList<SalesAgents>();
	
	@OneToMany(mappedBy ="manager2",cascade = CascadeType.ALL,orphanRemoval = true)
	private List<Leads>leads=new ArrayList<Leads>();
	
	public Manager() {
		super();
	}


	public Manager(int id, String firstname, String lastName, String email, String password) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


	public List<Manager> getAllmanagerDetails() {
		
		return Manager.findAll();
	}


	private static List<Manager> findAll() {
		// TODO Auto-generated method stub
		return null;
	}


	public Manager addmanagerDetails(Manager transientmanager) {
		
		return Manager.saveAll(transientmanager);
	}


	private static Manager saveAll(Manager transientmanager) {
		// TODO Auto-generated method stub
		return null;
	}


	public Manager deletemanagerDetails(Long managerId) {
		
		return Manager.deleteById(managerId);
	}


	private static Manager deleteById(Long managerId) {
		// TODO Auto-generated method stub
		return null;
	}




//	@Override
//	public String toString() {
//		return "Manager [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email
//				+ ", password=" + password + "]";
//	}
	
		
}
