package com.silverlakes.employee;

public class Employee {
	public int empId;
	public String empName;
	public double empSalary;
	public String empPerformance;
	public static String companyName;
	
	public Employee(int empId)
	{
		this.empId=empId;
		
		
		System.out.println("Object created");
		System.out.println("launch browser");
	}
	
	public Employee(int id,String name)
	{

	}
	
	public Employee(String name,int id)
	{

	}

	public void displayEmployeeDetail() {
		System.out.println("Employee Id: " + empId);
		System.out.println("Employee Name: " + empName);
		System.out.println("Employee Salary:" + empSalary);
		System.out.println("Employee Performance:" + empPerformance);
		System.out.println("Company Name:" + Employee.companyName);
		System.out.println("--------------------------------------");
	}

	public void addBonus() {
		if (empPerformance.equalsIgnoreCase("A")) 
		{
			empSalary = empSalary + 1000;
		} 
		else if (empPerformance.equalsIgnoreCase("B")) 
		{
			empSalary = empSalary + 500;
		} 
		else if (empPerformance.equalsIgnoreCase("C")) 
		{
			empSalary = empSalary + 100;
		}
	}
	
//	public static Employee getInstance()
//	{
//		Employee e=new Employee();
//		return e;
//	}
	
	public static void checkSalary(Employee e1,Employee e2)
	{
		if(e1.empSalary>e2.empSalary)
		{
			System.out.println("Employee 1 - Higher Salary");
		}
		else if(e1.empSalary<e2.empSalary)
		{
			System.out.println("Employee 2 - Higher Salary");
		}
		else
		{
			System.out.println("Employee 1 - Employee 2 - Same Salary");
		}
	}

}
