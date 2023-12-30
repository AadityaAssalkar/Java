// WAP to print the elements whose addition of digits is even.
// Ex. 26 = 2 + 6 = 8 (8 is even so print 26)
// Input:
// Enter array: 1 2 3 5 15 16 14 28 17 29 123
// Output: 2 15 28 17 123

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter array size: ");
		int size = Integer.parseInt(br.readLine());
		System.out.println("Enter array: ");
		int arr[] = new int[size];

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < arr.length; j++) {
			int sum = 0;
			for(int temp = arr[j]; temp != 0; temp = temp/10) {
				int rem = temp%10;
				sum = sum + rem;
			}
			if(sum%2 == 0) {
				System.out.print(arr[j] + " ");
			}
		}
		System.out.println();
	}
}
