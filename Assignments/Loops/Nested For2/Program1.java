// Write a program to print the following pattern

// C2W1    C2W2    C2W3    
// C2W1    C2W2    C2W3    
// C2W1    C2W2    C2W3    

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print("C2W" + j + "    ");
			}
			System.out.println();
		}
	}
}

// Dry Run:

// i     i <= 3     j     j <= 3     sop     j++     sop     i++
// 1     1 <= 3✅   1     1 <= 3✅   C2W1    2
//                  2     2 <= 3✅   C2W2    3
//                  3     3 <= 3✅   C2W3    4
//                  4     4 <= 3❌                   \n      2
// 2     2 <= 3✅   1     1 <= 3✅   C2W1    2
//                  2     2 <= 3✅   C2W2    3
//                  3     3 <= 3✅   C2W3    4
//                  4     4 <= 3❌                   \n      3
// 3     3 <= 3✅   1     1 <= 3✅   C2W1    2
//                  2     2 <= 3✅   C2W2    3
//                  3     3 <= 3✅   C2W3    4
//                  4     4 <= 3❌                   \n      4
// 4     4 <= 3❌ (END)
