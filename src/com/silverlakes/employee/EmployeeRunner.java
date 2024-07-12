package com.silverlakes.employee;

public class EmployeeRunner {
	
	public static void main(String[] args) 
	{
		Employee.companyName="SilverLake";
		
		Employee emp1=new Employee(102);
		Employee emp2=new Employee(104);
		Employee emp3=new Employee(103, "john");
		
//		Employee emp4= Employee.getInstance();
//		Employee.getInstance().displayEmployeeDetail();
		

		 emp1.empId = 101;
		 emp1.empName = "saul";
		 emp1.empSalary = 9000;
		 emp1.empPerformance="B";
		 
		 emp2.empId = 102;
		 emp2.empName = "kim";
		 emp2.empSalary = 6000;
		 emp2.empPerformance="A";
		 
		 
//		 System.out.println(emp1);
//		 System.out.println(emp2);
//		 System.out.println(emp3);
		
//		 Employee[] employees=new Employee[3];
//		 employees[0]=emp1;
//		 employees[1]=emp2;
//		 employees[2]=emp3;
//		 
//		 System.out.println(emp3.empId);
//		 System.out.println(employees[2].empId);
		 
		 emp2.displayEmployeeDetail();
		 emp2.addBonus();
		 emp2.displayEmployeeDetail();
		 
//		 emp4.displayEmployeeDetail();
		 
		 Employee.checkSalary(emp1, emp2);
	}
}
