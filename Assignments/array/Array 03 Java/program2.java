// WAP to reverse each element in an array.
// Take size and elements from the user
// Input: 10 25 252 36 564
// Output: 01 52 252 63 465

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

		for(int j = 0; j < arr.length; j++) {
			int rev = 0;
			int temp = arr[j];
			while(temp != 0) {
				int rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}
			System.out.print(rev + " ");
		}
		System.out.println();
	}
}
