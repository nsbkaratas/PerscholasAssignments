package org.perscholas.practicesba;

import java.util.ArrayList;

class Employee {
	String firstName;
	String lastName;
	String department;
	
	//constructor
	public Employee(String firstName, String lastName, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	@Override
	public String toString() {
		return firstName+lastName+department;
	}
	//getters and setters

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	
}

public class MyRunner {

	public static void main(String[] args) {
		
		String[] firstName = {"Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana"};
		 
		String[] lastName = {"Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr"};
		 
		String[] department = {"production", "r&d", "sales", "marketing", "human resources", "accounting", "sales", "r&d"};
		
		ArrayList<Employee> newEmp= new ArrayList<>();
		newEmp=addEmployes(firstName, lastName, department);
		System.out.println(newEmp);
		
	}
	public static ArrayList<Employee> addEmployes (String[] first,String[] last,String[] department){
		ArrayList<Employee> employees = new ArrayList<>();
		
		for (int i=0; i<department.length; i++) {
			Employee emp1=new Employee(first[i], last[i], department[i]);
			employees.add(emp1);
		}
		
		
		return employees ;
		}


}
