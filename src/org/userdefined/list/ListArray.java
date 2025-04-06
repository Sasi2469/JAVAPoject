package org.userdefined.list;

import java.util.ArrayList;
import java.util.List;

public class ListArray {

	
	
	public static void createEmployee() {
		
		List<EmployeeDetails> li = new ArrayList<EmployeeDetails>();
		
		EmployeeDetails employee1 = new EmployeeDetails();
		
		employee1.setId(32452);
		employee1.setName("sasi");
		employee1.setPhoneNumber(54528393483l);
		
EmployeeDetails employee2 = new EmployeeDetails();
		
		employee2.setId(45454);
		employee2.setName("kumar");
		employee2.setPhoneNumber(4526565673l);
		
EmployeeDetails employee3 = new EmployeeDetails();
		
		employee3.setId(2646);
		employee3.setName("sekar");
		employee3.setPhoneNumber(42563763l);

		li.add(employee3);
		li.add(employee1);
		li.add(employee2);
		
		
		for (EmployeeDetails employeeDetails : li) {
			System.out.println(employeeDetails);
			System.out.println(employeeDetails.getId());
			System.out.println(employeeDetails.getName());
			System.out.println(employeeDetails.getPhoneNumber());
		}
		
	}
	
	
		
	public static void main(String[] args) {
		createEmployee();
	}
	
	
}
