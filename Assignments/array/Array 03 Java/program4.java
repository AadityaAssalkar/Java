// WAP to find a prime number from an array and return its index.
// Take size and elements from the user
// Input: 10 25 36 566 34 53 50 100
// Output: prime no 53 found at index: 5

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter array elements: ");
		int arr[] = new int[size];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < arr.length; j++) {
			int temp = arr[j];
			int count = 0;

			for(int k = 1; k <= temp; k++) {
				if(temp%k == 0) {
					count++;
				}
			}

			if(count == 2) {
				System.out.println("prime no " + arr[j] + " found at index: " + j);
			}
		}
	}
}
