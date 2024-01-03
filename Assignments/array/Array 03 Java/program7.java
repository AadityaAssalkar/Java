// WAP to find a Strong number from an array and return its index.
// Take size and elements from the user
// Input 10 25 252 36 564 145
// Output: Strong no 145 found at index: 5

import java.io.*;

class Array {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter size: ");
		int size = Integer.parseInt(br.readLine());

		System.out.println("Enter array elements: ");
		int arr[] = new int[size];

		for(int i = 0; i < size; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for(int j = 0; j < arr.length; j++) {
			int temp = arr[j];
			int sum = 0;
			while(temp != 0) {
				int rem = temp%10;
				int facto = 1;
				for(int k = 1; k <= rem; k++) {
					facto = facto*k;
				}
				
				sum = sum + facto;
				temp = temp/10;
			}

			if(sum == arr[j]) {
				System.out.println("Strong no " + arr[j] + " found at index: " + j);
			}
		}
	}
}
