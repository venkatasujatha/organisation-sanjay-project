package com.tectoro.Controller;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tectoro.Service.ServiceInterface;
import com.tectoro.model.Employee;
import com.tectoro.model.Organisation;

@RestController
public class OrgController {
	
	@Autowired
	ServiceInterface serviceInterface;
	
	@PostMapping("/save")
	public String saveEmpcvc(@RequestBody Employee employee)
	{

		serviceInterface.getkjb(employee);
		return "Inserted";
		
	}
	@GetMapping("/get")
	public List<Organisation> getAllEmp(@RequestBody Organisation organisation)
	{
		return serviceInterface.getAllEmp(organisation);		
	}
	@GetMapping("/get/{orgname}")
	public Object getAllByOrgName(@PathVariable String orgname)
	{
		return serviceInterface.getByName(orgname);
	}
	@GetMapping("/getall/{name}/{sort}")
	public List<Employee> sortedByOrgName1(@PathVariable("name") String orgname,@PathVariable String name)
	{
		 return serviceInterface.getByNamejk(orgname,name);
	}
	
	  @GetMapping("/sortedByExp/{name1}") 
	  public List<Employee> sortedByYears(@PathVariable("name1") String orgname) 
	  { 
        return serviceInterface.sortedByExperience(orgname);
      }
	 
	
	
	
	
	
	
	
	
	
}
