// Write a Java program to find the sum of even and odd numbers in an array.
// Display the sum value.
// Input: 11 12 13 14 15
// Output:
// Odd numbers sum = 39
// Even numbers sum = 26

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int evenSum = 0;
		int oddSum = 0;
		int arr[] = new int[5];

		System.out.println("Enter the elements of array: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 == 0) {
				evenSum = evenSum + arr[i];
			} else {
				oddSum = oddSum + arr[i];
			}
		}
		System.out.println("Odd numbers sum = " + oddSum);
		System.out.println("Even numbers sum = " + evenSum);
	}
}
