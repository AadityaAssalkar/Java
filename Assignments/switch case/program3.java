// Write a program in which user should enter two numbers if both the numbers are positive multiply them and provide to switch case to verify number is even or odd, if user enters any negative number program should terminate saying "Sorry negative numbers not allowed"

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter first number: ");
		int a = Integer.parseInt(r.readLine());
		System.out.print("Enter second number: ");
		int b = Integer.parseInt(r.readLine());
		if(b < 0 || a < 0) {
			System.out.println("Sorry negative numberss not allowed");
		} else {
			System.out.println("Product of numbers is " + a*b);
			switch((a*b)%2) {
				case 0: System.out.println("even"); break;
				case 1: System.out.println("odd"); break;
			}
		}
	}
}
