// Write a program to take a number as input and print the Addition of Factorials of each digit from that number.
// Input: 1234
// Output: Addition of factorials of each digit from 1234 = 33

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Number = ");
		int num = Integer.parseInt(br.readLine());

		int sum = 0;

		for(int j = num; j != 0; j = j/10){
			int rem = j%10;
			int fact = 1;
			for(int i = 1; i <= rem; i++){
				fact = fact * i;
			}
			
			sum = sum + fact;
		}

		System.out.println("Addition of factorials of each digit from " + num + " = " + sum);
	}
}
