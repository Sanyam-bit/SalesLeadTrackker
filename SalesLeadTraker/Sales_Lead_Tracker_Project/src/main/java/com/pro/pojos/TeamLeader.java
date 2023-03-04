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
@Table(name="teamleaders")
public class TeamLeader {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="TL_Fname",length = 30)
	private String firstname;
	
	@Column(name="TL_Lname",length = 20)
	
	private String lastName;
	
	@Column(name="TL_email",length = 30,nullable=false)
	private String email;
	
	@Column(name="TL_pass")
	private String password;
	
	@OneToMany(mappedBy ="teamleader")
	private List<SalesAgents>salesagents=new ArrayList<SalesAgents>();
	
	@OneToMany(mappedBy ="teamleader")
	private List<Leads>leads=new ArrayList<Leads>();
	
	@ManyToOne
    @JoinColumn(name="manager_id")
	private Manager manager;

	public TeamLeader() {
		super();
	}

public TeamLeader(int id, String firstname, String lastName, String email, String password) {
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
	return manager;
}

public void setManager(Manager manager) {
	this.manager = manager;
}

//@Override
//public String toString() {
//	return "TeamLeader [id=" + id + ", firstname=" + firstname + ", lastName=" + lastName + ", email=" + email
//			+ ", password=" + password + "]";
//}
//	
	
}
	