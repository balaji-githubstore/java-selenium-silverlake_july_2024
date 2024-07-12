package com.silverlakes.methods;

import com.silverlakes.formulae.Area;

public class Demo1 {

	public static void main(String[] args) {

		int radius = 10;
		
		Area obj=new Area();

		double res = obj.areaOfCircle(20);
		System.out.println(res);

		res = obj.areaOfCircle(20);
		System.out.println(res);

		double output = Area.areaOfRectangle(10.2, 22);
		System.out.println(output);
		
		System.out.println(Area.areaOfTriangle(10, 10));
		
		String name=obj.getAuthorName();
		System.out.println(name);

	}
}
