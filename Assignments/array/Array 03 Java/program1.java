// Write a program to print count of digits in elements of array.
// Input: Enter array elements: 02 255 2 1554
// Output: 2 3 1 4

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of array: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter array elements: ");
		int arr[] = new int[size];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < arr.length; j++) {
			int count = 0;
			for(int k = arr[j]; k != 0; k = k/10) {
				count++;
			}
			System.out.print(count + " ");
		}
		System.out.println();
	}
}
