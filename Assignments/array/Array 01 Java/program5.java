// Write a program, take 10 input from the user and print only elements that are divisible by 5.
// Input: 10 2 2 3 3 3 4 4 25 55
// Output: 10 25 55

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int x: arr) {
			if(x%5 == 0) {
				System.out.print(x + " ");
			}
		}
		System.out.println("");
	}
}
