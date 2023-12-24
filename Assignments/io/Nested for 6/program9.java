// Write a program to print a series of strong numbers from entered range. (Take a start and end number from a user)

// Input: Enter starting number: 1
//	  Enter ending number: 150
// Output: Strong numbers between 1 and 150
//      1     2     145     

import java.io.*;

class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter starting number: ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("Enter ending number: ");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Strong numbers between " + start + " and " + end);
		for(int i = start; i <= end; i++) {
			int sum = 0;
			for(int j = i; j != 0; j = j/10) {
				int rem = j%10;
				int fact = 1;
				for(int k = 1; k <= rem; k++) {
					fact = fact*k;
				}
				sum = sum + fact;
			}

			if(i == sum) {
				System.out.print("    " + i);
			}
		}
		System.out.println("");
	}
}
