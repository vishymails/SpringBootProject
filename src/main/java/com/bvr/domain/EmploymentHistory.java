package com.bvr.domain;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EmploymentHistory {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int id;
	
	
	public int empId;
	
	public String organization_name;
	public Date fromDate, untilDate;
	public String location, country, post, skill_used;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getOrganization_name() {
		return organization_name;
	}
	public void setOrganization_name(String organization_name) {
		this.organization_name = organization_name;
	}
	public Date getFromDate() {
		return fromDate;
	}
	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}
	public Date getUntilDate() {
		return untilDate;
	}
	public void setUntilDate(Date untilDate) {
		this.untilDate = untilDate;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getSkill_used() {
		return skill_used;
	}
	public void setSkill_used(String skill_used) {
		this.skill_used = skill_used;
	}
	
	
	public EmploymentHistory(int empId, String organization_name, Date fromDate, Date untilDate, String location,
			String country, String post, String skill_used) {
		super();
		this.empId = empId;
		this.organization_name = organization_name;
		this.fromDate = fromDate;
		this.untilDate = untilDate;
		this.location = location;
		this.country = country;
		this.post = post;
		this.skill_used = skill_used;
	}
	
	
	public EmploymentHistory() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "EmploymentHistory [id=" + id + ", empId=" + empId + ", organization_name=" + organization_name
				+ ", fromDate=" + fromDate + ", untilDate=" + untilDate + ", location=" + location + ", country="
				+ country + ", post=" + post + ", skill_used=" + skill_used + "]";
	}
	
	
	
	
	
	

}
