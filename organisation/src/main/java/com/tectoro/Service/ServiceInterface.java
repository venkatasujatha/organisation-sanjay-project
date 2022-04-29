package com.tectoro.Service;

import java.util.Comparator;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.tectoro.model.Employee;
import com.tectoro.model.Organisation;

public interface ServiceInterface {

	void getkjb(Employee employee);

	/*
	 * List<Organisation> findById(Employee employee);
	 * 
	 * List<Organisation> findAll(Employee employee);
	 * 
	 * List<Organisation> getAllEmp(Employee employee);
	 */
	List<Organisation> getAllEmp(Organisation organisation);

	Object getByName(String orgname);
	public List<Employee> sortedByOrgName1( String name);

	List<Employee> getByNamejk(String orgname,String name);

	//void sortedByExperience(int experience);

	List<Employee> sortedByExperience(String orgname);

	//Object sortedByExperience(int experience);

	
	
}
