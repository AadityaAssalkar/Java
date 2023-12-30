// WAP to take size of array from user and also take integer elements from user
// find the maximum element from the array
// Input: Enter size: 5
// Enter array elements: 1 2 5 0 4
// Output: max element = 5

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int max = Integer.MIN_VALUE;
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("max element = " + max);
	}
}
