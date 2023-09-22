// Write a program to print the following pattern

// 1A    2B    3C    
// 1A    2B    3C    
// 1A    2B    3C    

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 3; i++) {
//	for(int j = 1; j <= 3; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			char ch = 'A';
			for(int j = 1; j <= 3; j++) {
				System.out.print(j + "" + ch++ + "    ");
			}
			System.out.println();
		}
	}
}


// Dry Run:

// i     i <= 3     ch     j     j <= 3     sop     j++     sop     i++
// 1     1 <= 3✅   A      1     1 <= 3✅   1A      2
//                         2     2 <= 3✅   2B      3
//                         3     3 <= 3✅   3C      4
//                         4     4 <= 3❌                   \n      2
// 2     2 <= 3✅   A      1     1 <= 3✅   1A      2
//                         2     2 <= 3✅   2B      3
//                         3     3 <= 3✅   3C      4
//                         4     4 <= 3❌                   \n      3
// 3     3 <= 3✅   A      1     1 <= 3✅   1A      2
//                         2     2 <= 3✅   2B      3
//                         3     3 <= 3✅   3C      4
//                         4     4 <= 3❌                   \n      4
// 4     4 <= 3❌ 
