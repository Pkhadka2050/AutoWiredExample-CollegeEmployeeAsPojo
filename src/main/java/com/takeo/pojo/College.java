package com.takeo.pojo;

public class College {
	
	private String name;
	
	private Employee emp;

	public void setName(String name) {
		this.name = name;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	public void displayStudentInfo()
	{
		System.out.println("College Name: "+ name);
		System.out.println("Employee Details: ");
		System.out.println(emp.getEno()+"\t"+emp.getEname()+"\t"+emp.getEadd());
	}

}
