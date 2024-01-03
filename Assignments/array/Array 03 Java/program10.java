// Write a program to print the second min element in the array
// Input: Enter array elements: 255 2 1554 15 65 95 89
// Output: 15

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

		int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}

		int secMin = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < secMin && arr[i] > min) {
				secMin = arr[i];
			}
		}

		System.out.println("Second min element in array is " + secMin);	
	}
}
