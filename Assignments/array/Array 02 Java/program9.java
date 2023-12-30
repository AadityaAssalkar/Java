// Write a Java program to merge two given arrays.
// Input:
// Array1 = [10, 20, 30, 40, 50]
// Array2 = [9, 18, 27, 36, 45]
// Output:
// Merged Array = [10, 20, 30, 40, 50, 9, 18, 27, 36, 45]
// Hint: you can take 3rd array

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size of Array1: ");
		int size1 = Integer.parseInt(br.readLine());

		System.out.print("Array1 = ");
		int arr1[] = new int[size1];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.print("Enter size of Array2: ");
		int size2 = Integer.parseInt(br.readLine());
		System.out.print("Array2 = ");
		int arr2[] = new int[size2];
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = Integer.parseInt(br.readLine());
		}
		
		int arr3[] = new int[size1+size2];
		for(int k = 0; k < size1; k++) {
			arr3[k] = arr1[k];
		}
		for(int l = 0; l < size1; l++) {
			arr3[size1+l] = arr2[l];
		}

		System.out.print("Merged Array = ");
		for(int m = 0; m < arr3.length; m++) {
			System.out.print(arr3[m] + " ");
		}
		System.out.println();
	}
}
