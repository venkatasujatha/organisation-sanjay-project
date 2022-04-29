package com.tectoro.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.tectoro.Repository.OrganisationRepository;
import com.tectoro.model.Employee;
import com.tectoro.model.Organisation;

@Service
public class ServiceInterfaceImpl implements ServiceInterface{

	@Autowired
	OrganisationRepository organisationRepository;
	private String name;
	
	@Override
	public void getkjb(Employee employee) {
		


		
		Organisation orgName2 = (Organisation) organisationRepository.findByOrgname(employee.getOrgName());
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		orgName2.setEmployee(list);
		list.add(employee);
		System.out.println("hirr");
		organisationRepository.save(orgName2);
		
		
	}
	@Override
	public List<Organisation> getAllEmp(Organisation organisation) {
		
		return organisationRepository.findAll();
	}
	@Override
	public Object getByName(String orgname) {
		
		return organisationRepository.findByOrgname(orgname);
	}
	
	@Override
	public List<Employee> sortedByOrgName1(String orgname) {
		
//		List<Organisation> c=organisationRepository.findOne(orgname);
//		List<Employee> emp1 = new ArrayList<>();
//		for(Organisation e:c)
//		{
//			emp1.addAll(e.getEmployee());
//		}
		
		return null;
		
		
	
	
	}
	@Override
	public List<Employee> getByNamejk(String orgname,String name) {
		List<Organisation> list = organisationRepository.findByOrgname(orgname);
		List<Employee> employee = list.get(0).getEmployee();
		System.out.println("hi");
		if(name.equalsIgnoreCase("name"))
		{

		 employee.sort((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		}
		else if(name.equalsIgnoreCase("experience"))
		{
			employee.sort((o1, o2) -> o1.getExperience()-o2.getExperience());
		}
		return employee;
			
	}
	@Override
	public List<Employee> sortedByExperience(String orgname) {
	List<Organisation> findByOrgname = organisationRepository.findByOrgname(orgname);
	List<Employee> emp1=findByOrgname.get(0).getEmployee();
	
	return emp1;
		
	}
	

}
