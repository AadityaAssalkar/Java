// Write a program to print the following pattern

// 26    Z    25    Y    
// 24    X    23    W    
// 22    V    21    U    
// 20    T    19    S    

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 4; i++) {
//	for(int j = 1; j <= 4; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		int num = 26;
		char ch = 'Z';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j%2 == 1)
					System.out.print(num-- + "    ");
				else
					System.out.print(ch-- + "    ");
			}
			System.out.println();
		}
	}
}


// Dry Run:

// num = 26, ch = 'Z'
// i     i <= 4     j     j <= 4     body     j++     sop     i++
// 1     1 <= 4✅   1     1 <= 4✅   26       2
//                  2     2 <= 4✅   Z        3
//                  3     3 <= 4✅   25       4
//                  4     4 <= 4✅   Y        5
//                  5     5 <= 4❌                    \n      2
// 2     1 <= 4✅   1     1 <= 4✅   24       2
//                  2     2 <= 4✅   X        3
//                  3     3 <= 4✅   23       4
//                  4     4 <= 4✅   W        5
//                  5     5 <= 4❌                    \n      3
// 3     1 <= 4✅   1     1 <= 4✅   22       2
//                  2     2 <= 4✅   V        3
//                  3     3 <= 4✅   21       4
//                  4     4 <= 4✅   U        5
//                  5     5 <= 4❌                    \n      4
// 4     1 <= 4✅   1     1 <= 4✅   20       2
//                  2     2 <= 4✅   T        3
//                  3     3 <= 4✅   19       4
//                  4     4 <= 4✅   S        5
//                  5     5 <= 4❌                    \n      5
// 5     5 <= 4❌ 
