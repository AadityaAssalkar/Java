// WAP to find the common elements between two arrays.
// Input:
// Enter first array: 1 2 3 5
// Enter second array: 2 1 9 8
// Output: Common elements: 
// 1
// 2

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first array: ");
		int arr1[] = new int[4];
		for(int i = 0; i < arr1.length; i++) {
			arr1[i] = Integer.parseInt(br.readLine());
		}

		System.out.println("Enter second array: ");
		int arr2[] = new int[4];
		for(int j = 0; j < arr2.length; j++) {
			arr2[j] = Integer.parseInt(br.readLine());
		}

		System.out.println("Common elements: ");
		for(int k = 0; k < arr1.length; k++) {
			for(int l = 0; l < arr2.length; l++) {
				if(arr1[k] == arr2[l]) {
					System.out.println(arr1[k]);
					break;
				}
			}
		}
	}
}
