// write a program to print the following pattern
// 5    4    3    2    1
// 8    6    4    2    
// 9    6    3
// 8    4
// 5

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row;
// Take the number of rows from user
// for(int i = 1; i <= row; i++) {
// }

import java.io.*;

class Demo {
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Row = ");
		int row = Integer.parseInt(br.readLine());

		for(int i = 1; i <= row; i++) {
			for(int j = row-i+1; j > 0; j--) {
				System.out.print(i*j + "    ");
			}
			System.out.println("");
		}
	}
}
