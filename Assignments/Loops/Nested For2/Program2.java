// Write a program to print the following pattern

// 4    4    4    4    
// 5    5    5    5    
// 6    6    6    6    
// 7    7    7    7    

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 4; i++) {
//	for(int j = 1; j <= 4; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				System.out.print(i+3 + "    ");
			}
			System.out.println();
		}
	}
}


// Dry Run:

// i     i <= 4     j     j <= 4     sop     j++     sop     i++
// 1     1 <= 4✅   1     1 <= 4✅   4       2
//		    2     2 <= 4✅   4       3
//		    3     3 <= 4✅   4       4
//		    4     4 <= 4✅   4       5
//		    5     5 <= 4❌ 		     \n      2
// 2     2 <= 4✅   1     1 <= 4✅   5       2
//		    2     2 <= 4✅   5       3
//		    3     3 <= 4✅   5       4
//		    4     4 <= 4✅   5       5
//		    5     5 <= 4❌ 		     \n      3
// 3     3 <= 4✅   1     1 <= 4✅   6       2
//		    2     2 <= 4✅   6       3
//		    3     3 <= 4✅   6       4
//		    4     4 <= 4✅   6       5
//		    5     5 <= 4❌ 		     \n      4
// 4     4 <= 4✅   1     1 <= 4✅   7       2
//		    2     2 <= 4✅   7       3
//		    3     3 <= 4✅   7       4
//		    4     4 <= 4✅   7       5
//		    5     5 <= 4❌ 		     \n      5
// 5     5 <= 4❌ END
