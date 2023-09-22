// Write a program to print the following pattern

// 1    4    9    
// 16   25   36   
// 49   64   81   

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
				if(num < 4)
					System.out.print(num*num + "    ");
				else
					System.out.print(num*num + "   ");
				num++;
			}
			System.out.println();
		}
	}
}


// Dry Run:

// num = 1
// i     i <= 3     j     j <= 3     sop     num++     j++     sop     i++
// 1     1 <= 3✅   1     1 <= 3✅   1       2         2
//                  2     2 <= 3✅   4       3         3
//                  3     3 <= 3✅   9       4         4
//                  4     4 <= 3❌                             \n      2
// 2     2 <= 3✅   1     1 <= 3✅   16      5         2
//                  2     2 <= 3✅   25      6         3
//                  3     3 <= 3✅   36      7         4
//                  4     4 <= 3❌                             \n      3
// 3     3 <= 3✅   1     1 <= 3✅   49      8         2
//                  2     2 <= 3✅   64      9         3
//                  3     3 <= 3✅   81      10        4
//                  4     4 <= 3❌                             \n      4
// 4     4 <= 3❌
