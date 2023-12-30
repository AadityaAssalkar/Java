// WAP to take size of array from user and also take integer elements from user find the minimum element from the array
// Input: Enter size: 5
// Enter array elements: 1 2 5 0 4 
// Output: min element = 0

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int min = Integer.MAX_VALUE;
		System.out.println("Enter array elements: ");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("min element = " + min);
	}
}
