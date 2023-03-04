package com.pro.pojos;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="leads")
public class Leads {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="lead_id")
	private int id;
	
	@Column(name="lead_name",length = 60)
	private String leadName;
	
	@Column(name="lead_profileImge")
	private String profileImage;
	
	@Column(name="lead_contact1")
	private String contact1;
	
	@Column(name="lead_contact2")
	private String contact2;
	
	@Column(name="lead_location")
	private String location;
	
	@Column(name="lead_occupation")
	private String occupation;
	
	@Column(name="lead_budgetRange")
	private String budgetRange;
	
	@Column(name="lead_interestedpropertyType")
	private String interestedPropertyType;

    
	@ManyToOne
    @JoinColumn(name="manager_id")
	private Manager manager2;

	@ManyToOne
    @JoinColumn(name="TL_id")
	private TeamLeader teamleader;
	
	@ManyToOne
    @JoinColumn(name="salesAgents_id")
	private SalesAgents salesAgents;

	  public Leads() {
			super();
		}


public Leads(int id, String leadName, String profileImage, String contact1, String contact2, String location,
		String occupation, String budgetRange, String interestedPropertyType) {
	super();
	this.id = id;
	this.leadName = leadName;
	this.profileImage = profileImage;
	this.contact1 = contact1;
	this.contact2 = contact2;
	this.location = location;
	this.occupation = occupation;
	this.budgetRange = budgetRange;
	this.interestedPropertyType = interestedPropertyType;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getLeadName() {
	return leadName;
}


public void setLeadName(String leadName) {
	this.leadName = leadName;
}


public String getProfileImage() {
	return profileImage;
}


public void setProfileImage(String profileImage) {
	this.profileImage = profileImage;
}


public String getContact1() {
	return contact1;
}


public void setContact1(String contact1) {
	this.contact1 = contact1;
}


public String getContact2() {
	return contact2;
}
public void setContact2(String contact2) {
	this.contact2 = contact2;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getOccupation() {
	return occupation;
}
public void setOccupation(String occupation) {
	this.occupation = occupation;
}
public String getBudgetRange() {
	return budgetRange;
}
public void setBudgetRange(String budgetRange) {
	this.budgetRange = budgetRange;
}


public String getInterestedPropertyType() {
	return interestedPropertyType;
}


public void setInterestedPropertyType(String interestedPropertyType) {
	this.interestedPropertyType = interestedPropertyType;
}


public Manager getManager() {
	return manager2;
}


public void setManager(Manager manager) {
	this.manager2 = manager;
}


public TeamLeader getTeamleader() {
	return teamleader;
}


public void setTeamleader(TeamLeader teamleader) {
	this.teamleader = teamleader;
}


public SalesAgents getSalesAgents() {
	return salesAgents;
}


public void setSalesAgents(SalesAgents salesAgents) {
	this.salesAgents = salesAgents;
}
	

	  
	
	
	}
