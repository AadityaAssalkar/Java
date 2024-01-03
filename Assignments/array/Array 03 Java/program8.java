// WAP to find an ArmStrong number from an array and return its index.
// Take size and elements from the user
// Input: 10 25 252 36 153 55 89
// Output: Armstrong no 153 fond at index: 4

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

		for(int i = 0; i < arr.length; i++) {
			int temp = arr[i];
			int sum = 0;
			int count = 0;

			for(int j = temp; j != 0; j = j/10) {
				count++;
			}

			for(int j = temp; j != 0; j = j/10) {
				int rem = j%10;
				int pow = 1;
				for(int k = 1; k <= count; k++) {
					pow = pow*rem;
				}

				sum = sum + pow;
			}
	
			if(sum == arr[i]) {
				System.out.println("Armstrong no " + arr[i] + " found at index: " + i);
			}
		}
	}
}
