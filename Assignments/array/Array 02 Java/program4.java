// WAP to search a specific element from an array and return its index.
// Input: 1 2 4 5 6
// Enter element to search: 4
// Output: element found at index: 2

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];

		System.out.println("Enter elements of array: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("element to search: ");
		int el = Integer.parseInt(br.readLine());

		for(int j = 0; j < arr.length; j++) {
			if(el == arr[j]) {
				System.out.println("element found at index: " + j);
			}
		}
	}
}
