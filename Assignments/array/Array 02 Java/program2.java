// WAP to find the number of even and odd integers in a given array of integers
// Input: 1 2 5 4 6 7 8
// Output:
// Number of Even Elements: 4
// Number of Odd Elements: 3

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[7];
		int evenCount = 0;
		int oddCount = 0;

		System.out.println("Enter elements in array: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Number of Even Elements: " + evenCount);
		System.out.println("Number of Odd Elements: " + oddCount);
	}
}
