package com.tectoro.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Organisation {
	@Id
	private int id;
	
	private String orgname;
	
	@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name="org_id",referencedColumnName = "id",nullable = false)
	private List<Employee> employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrgname() {
		return orgname;
	}

	public void setOrgname(String orgname) {
		this.orgname = orgname;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Organisation [id=" + id + ", orgname=" + orgname + ", employee=" + employee + "]";
	}

	public Organisation(int id, String orgname, List<Employee> employee) {
		super();
		this.id = id;
		this.orgname = orgname;
		this.employee = employee;
	}

	public Organisation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	

}
