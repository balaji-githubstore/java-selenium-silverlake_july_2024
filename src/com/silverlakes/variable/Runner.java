package com.silverlakes.variable;

public class Runner {
	
	public static int aS=10; //static variable or class variable
	public static int bS=20;
	
	public int aNS=10; //non-static variable or instance variable
	public int bNS=20;
	
	
	public static void main(String[] args) {
		
		
		Runner.aS=1000;
		
		System.out.println(Runner.aS);
		System.out.println(Runner.bS);
		
		Runner obj1=new Runner();
		obj1.aNS=2000;
		
		System.out.println(obj1.aNS);
		System.out.println(obj1.bNS);
		
		Runner obj2=new Runner();
		
		System.out.println(obj2.aNS);
		System.out.println(obj2.bNS);
		
	}

}//will start at 3:55 PM 
