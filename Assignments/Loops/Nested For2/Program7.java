// Write a program to print the following pattern

// 1    2    9    
// 4    25   6   
// 49   8    81   

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 3; i++) {
//	for(int j = 1; j <= 3; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		int num = 1;
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(num%2 == 1) {
					if(num == 1)
						System.out.print(num*num + "    ");
					else
						System.out.print(num*num + "   ");
				}
				else {
					System.out.print(num + "    ");
				}
				num++;
			}
			System.out.println();
		}
	}
}


// Dry Run:

// i     i <= 3     j     j <= 3     body     num++     j++     sop     i++
// 1     1 <= 3✅   1     1 <= 3✅   1        2         2
//                  2     2 <= 3✅   2        3         3
//                  3     3 <= 3✅   9        4         4
//                  4     4 <= 3❌                              \n      2
// 2     2 <= 3✅   1     1 <= 3✅   4        5         2
//                  2     2 <= 3✅   25       6         3
//                  3     3 <= 3✅   6        7         4
//                  4     4 <= 3❌                              \n      3
// 3     3 <= 3✅   1     1 <= 3✅   49       8         2
//                  2     2 <= 3✅   8        9         3
//                  3     3 <= 3✅   81       10         4
//                  4     4 <= 3❌                              \n      4
// 4     4 <= 3❌ END
