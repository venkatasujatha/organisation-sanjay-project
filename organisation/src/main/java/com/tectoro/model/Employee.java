package com.tectoro.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private int age;
	private String qualification;
	private int experience;
	private int salary;
	private int performance_appraisal;
	private int leaves_taken;
	@Transient
	private String orgName;
	

	
	public String getOrgName() {
		return orgName;
	}
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getPerformance_appraisal() {
		return performance_appraisal;
	}
	public void setPerformance_appraisal(int performance_appraisal) {
		this.performance_appraisal = performance_appraisal;
	}
	public int getLeaves_taken() {
		return leaves_taken;
	}
	public void setLeaves_taken(int leaves_taken) {
		this.leaves_taken = leaves_taken;
	}
	
	public Employee(int id, String name, int age, String qualification, int experience, int salary,
			int performance_appraisal, int leaves_taken) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.experience = experience;
		this.salary = salary;
		this.performance_appraisal = performance_appraisal;
		this.leaves_taken = leaves_taken;
		
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", qualification=" + qualification
				+ ", experience=" + experience + ", salary=" + salary + ", performance_appraisal="
				+ performance_appraisal + ", leaves_taken=" + leaves_taken + ", orgName=" + orgName + "]";
	}
	

}
