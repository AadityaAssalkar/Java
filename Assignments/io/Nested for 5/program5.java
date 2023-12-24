// write a program to print the following pattern
// Row = 4
//     0
//     1    1
//     2    3    5
//     8    13   21   34

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

		int pre = 0;
		int curr = 1;
		int fib = 0;

		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i; j++) {
				if(fib < 14) {
					System.out.print("    " + fib);
				} else {
					System.out.print("   " + fib);
				}
				pre = curr;
				curr = fib;
				fib = pre + curr;
			}
			System.out.println("");
		}
	}
}

// sop    pre = curr    curr = fib    fib = pre + curr
// 0      1             0             1
// 1	  0		1	      1
// 1	  1		1	      2
// 2	  1		2	      3 ...
