// Write a program to take range as input from the use and print Palindrome numbers.(Take a start and end number from a user)
// Input: Enter start: 100
//	  Enter end: 250
// Output: Palindrome numbers between 100 and 250
// 101 111 121 131 141 151 161 171 181 191 202 212 222 232 242

import java.io.*;

class Demo{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter start: ");
		int start = Integer.parseInt(br.readLine());
		System.out.print("Enter end: ");
		int end = Integer.parseInt(br.readLine());

		System.out.println("Palindrome numbers between " + start + " and " + end);
		for(int i = start; i <= end; i++) {
			int rev = 0;
			for(int j = i; j != 0; j = j/10) {
				int rem = j%10;
				rev = rev*10 + rem;
			}
			if(i == rev) {
				System.out.print(i + " ");
			}
		}
		System.out.println("");
	}
}
