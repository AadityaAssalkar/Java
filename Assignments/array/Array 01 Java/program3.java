// WAP to take size of array from user and also take integer elements from user Print product of odd index only
// Input: Enter size: 6
// Enter array elements: 1 2 3 4 5 6

// Output: 48
// 2 * 4 * 6

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		int prod = 1;
		int arr[] = new int[size];
		System.out.println("Enter array elements: ");

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(i%2 == 1) {
				prod = prod * arr[i];
			}
		}
		System.out.println("Product of odd indexed elements = " + prod);
	}
}
