// WAP to find a Perfect number from an array and return its index.
// Take size and elements from the user
// Input: 10 25 252 496 564
// Output: Perfect no 496 found at index: 3

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
			int sum = 0;
			int temp = arr[j];
			for(int k = 1; k < temp; k++) {
				if(temp%k == 0) {
					sum = sum + k;
				}
			}

			if(sum == arr[j]) {
				System.out.println("Perfect no " + arr[j] + " found at index: " + j);
			}
		}
	}
}
