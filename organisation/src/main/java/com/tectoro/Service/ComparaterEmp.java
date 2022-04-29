package com.tectoro.Service;

import java.util.Comparator;

import com.tectoro.model.Employee;

public class ComparaterEmp implements Comparator<Employee>{
	private String name;
	private int exp;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	@Override
	public String toString() {
		return "ComparaterEmp [name=" + name + ", exp=" + exp + "]";
	}

	@Override
	public int compare(Employee o1, Employee o2) {
		int name=o1.getName().compareTo(o2.getName());
		return name;
		
	}
	public class ComparatorExp implements Comparator<Employee> {

		@Override
		public int compare(Employee o1, Employee o2) {
			Integer exp1=o1.getExperience();
			Integer exp2=o2.getExperience();
			int exp= exp1.compareTo(exp2);
			return exp;
		}


	}		
	}
