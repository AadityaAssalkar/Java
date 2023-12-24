// Write a program to take a range as input fromthe user and print perfect cubes between that range.
// Input: Enter start: 1
// 	  Enter end: 100
// Output: perfect cubes between 1 and 100
// 1 8 27 64 

import java.io.*;

class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("Enter end: ");
		int end  = Integer.parseInt(br.readLine());

		System.out.println("Output: perfect cubes between " + start + " and " + end);
		for(int i = start; i*i*i <= end; i++) {
			System.out.print(i*i*i + " ");
		}
		System.out.println("");
	}
}
