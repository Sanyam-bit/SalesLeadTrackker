package com.pro.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="salesagents")
public class SalesAgents {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="salesAgents_id")
	private int id;
	
	@Column(name="salesAgents_Fname",length = 30)
	private String firstname;
	
	@Column(name="salesAgents_Lname",length = 20)
	private String lastName;
	
	@Column(name="salesAgents_email",length = 30,nullable=false)
	private String email;
	
	@Column(name="salesAgents_pass")
	private String password;
	
	@ManyToOne
    @JoinColumn(name="manager_id")
	private Manager manager1;

	@ManyToOne
    @JoinColumn(name="TL_id")
	private TeamLeader teamleader;
	
	@OneToMany(mappedBy ="salesAgents")
	private List<Leads>leads=new ArrayList<Leads>();

	public SalesAgents() {
		super();
	}
public SalesAgents(int id, String firstname, String lastName, String email, String password) {
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
public Manager getManager() {
	return manager1;
}
public void setManager(Manager manager) {
	this.manager1 = manager;
}
public TeamLeader getTeamleader() {
	return teamleader;
}
public void setTeamleader(TeamLeader teamleader) {
	this.teamleader = teamleader;
}
	
	
}
