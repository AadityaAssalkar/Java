// Write a program to take range as input from the user and print the reverse of all numbers. (Take a start and end number from a user)

// Input: Enter start: 100
//	  Enter end: 200
// Output: Reverse of all numbers between 100 and 200
// 001 101 201 301 401 ... 002

import java.io.*;

class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("Enter end: ");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Output: Reverse of all numbers between " + start + " and " + end);
		for(int i = start; i <= end; i++) {
			for(int j = i; j != 0; j = j/10) {
				System.out.print(j%10);
			}
			System.out.print(" ");
		}
		System.out.println("");
	}
}
