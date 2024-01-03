// WAP to find a composite number from an array and return its index.
// Take size and elements from the user
// Input: 1 2 3 5 6 7
// Output: composite 6 found at index: 4

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
			int temp = arr[j];
			int count = 0;
			for(int k = 1; k <= temp; k++) {
				if(temp%k == 0) {
					count++;
				}
			}

			if(count > 2) {
				System.out.println("composite " + arr[j] + " found at index: " + j);
			}
		}
	}
}
