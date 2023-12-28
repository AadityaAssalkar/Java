// WAP to take size of array from user and also take integer elements from user Print product of even elements only
// Input: Enter size: 9
// Enter array elements: 1 2 3 2 5 10 55 77 99

// Output: 40
// 2 * 2 * 10

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int prod = 1;
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());

			if(arr[i]%2 == 0) {
				prod = prod * arr[i];
			}
		}
		System.out.println("Product of even elements = " + prod);
	}
}
