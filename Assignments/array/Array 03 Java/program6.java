// WAP to find a palindrome number from an array and return its index.
// Take size and elements from the user
// Input: 10 25 252 36 564
// Output: Palindrome no 252 found at index: 2

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
			int temp = arr[j];
			int rev = 0;
			while(temp != 0) {
				int rem = temp%10;
				rev = rev*10 + rem;
				temp = temp/10;
			}

			if(rev == arr[j]) {
				System.out.println("Palindrome no " + arr[j] + " found at index: " + j);
			}
		}
	}
}
