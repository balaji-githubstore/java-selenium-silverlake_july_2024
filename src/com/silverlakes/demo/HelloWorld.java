package com.silverlakes.demo;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println("Balaji Dinakaran123!!");

		byte a = 100; // 8 bits will be occupied
		short b = 100; // 16 bits
		int c = 100; // 32 bits

		long d = 984334899834L;

		float e = 1.123456789f;
		double f = 1.123456789;

		System.out.println(e);
		System.out.println(f);

		char letter = 'b';
		boolean check = true;

		System.out.println(letter);

		// non-predefined
		String name = "Bala"; // 4*16 bits

		int radius = 10;
		// calculate area of circle and print it

		// 3.14
		double result = 3.14 * radius * radius;
		System.out.println(result);

		double a1 = 22.0;
		int b1 = 7;

		// try a1/b1 and print it
		System.out.println(a1 / b1);

		System.out.println(22 / 7.0);

		int base1 = 25;
		int height1 = 1;

		// calculate area of triangle and print it
		double result1 = (base1 * height1) / 2.0;
		System.out.println(result1);

		int[] numbers = new int[5];
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		System.out.println(numbers[5]);

		String[] colors = { "red", "yellow", "blue" };
		int[] arr = { 10, 20, 34, 44 };

	}

}
