// write a program to print the following pattern
//     D4    C3    B2    A1
//     A1    B2    C3    D4
//     D4    C3    B2    A1
//     A1    B2    C3    D4

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
			char even = 'A';
			char odd = (char)(64+row);
			int num = row;
			for(int j = 1; j <= row; j++) {
				if(i%2 == 1) {
					System.out.print("    " + odd-- + num--);
				} else {
					System.out.print("    " + even++ + j);
				}
			}
			System.out.println("");
		}
	}
}
