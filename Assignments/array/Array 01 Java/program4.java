// Write a program, take 7 characters as an input, Print only vowels from the array
// Input: a b c o d p e
// Output: a o e

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		char arr[] = new char[7];
		for(int j = 0; j < arr.length; j++) {
			char temp = (char)br.read();
			br.skip(1);
			arr[j] = temp;
		}

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == 'A' || arr[i] == 'E' || arr[i] == 'I' || arr[i] == 'O' || arr[i] == 'U') {
				System.out.print(arr[i] + " ");
			}
		}

		System.out.println("");
	}
}
