package com.tectoro.Repository;




import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tectoro.model.Employee;
import com.tectoro.model.Organisation;

@Repository
public interface OrganisationRepository extends JpaRepository<Organisation, Integer>{

	List<Organisation> findByOrgname(String orgName);

	//void findByExperience(int experience);


	

	





}
