// Write a program to take range as input from the user and print Armstrong numbers. (Take a start and end number from a user)

// Input: Enter start: 1
//	  Enter end: 1650
// Output: Armstrong numbers between 1 and 1650
// 1 2 3 4 5 6 7 8 9 153 370 371 407 1634

import java.io.*;

class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("Enter end: ");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Output: Armstrong numbers between " + start + " and " + end);
		for(int i = start; i <= end; i++) {
			int sum = 0;
			int count = 0;

			for(int j = i; j != 0; j = j/10) {
				count++;
			}

			for(int l = i; l != 0; l = l/10) {
				int rem = l%10;
				int power = 1;
				for(int k = 1; k <= count; k++) {
					power = power * rem;
				}
				sum = sum + power;
			}
			
			if(i == sum) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
}
