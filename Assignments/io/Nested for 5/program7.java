// write a program to print the following pattern
// Row = 5;
//     0
//     14    13
//     L     K     J
//     9     8     7     6
//     E     D     C     B     A

// Row = 4;
// 10
// I    H
// 7    6    5
// D    C    B    A

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row;
// Take the number of rows from user
// for(int i = 1; i <= row; i++) {
// }

import java.io.*;

class Demo {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Row = ");
		int row = Integer.parseInt(br.readLine());

		int num = 0;
		for(int s = row; s > 0; s--){
			num = num + s;
		}

		for(int i = 1; i <= row; i++){
			for(int j = 1; j <= i; j++){
				if(row%2 == 0) {
					if(i%2 != 0){
						System.out.print(num-- + "    ");
					} else{
						System.out.print((char)(64 + num--) + "    ");
					}
				} else {
					if(i%2 == 0) {
						System.out.print("    " + num--);
					} else{
						System.out.print("    " + (char)(64 + num--));
					}
				}
			}
			System.out.println("");
		}
	}
}
