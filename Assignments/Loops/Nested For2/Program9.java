// Write a program to print the following pattern

// 1C3    4B2    9A1    
// 16C3   25B2   36A1    
// 49C3   64B2   81A1    

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
			char ch = 'C';
			int rev = 3;
			for(int j = 1; j <= 3; j++) {
				if(num < 4) {
					System.out.print(num*num + "" + ch + rev-- + "    ");
				} else {
					System.out.print(num*num + "" + ch + rev-- + "   ");
				}
				ch--;
				num++;
			}
			System.out.println();
		}
	}
}


// Dry Run:

// num = 1
// i     i <= 3     ch     rev     j     j <= 3     sop     rev--     ch--     num++     j++     sop     i++
// 1     1 <= 3✅   C      3       1     1 <= 3✅   1C3     2         B        2         2
//                                 2     2 <= 3✅   4B2     1         A        3         3
//                                 3     3 <= 3✅   9A1     0         @        4         4
//                                 4     4 <= 3❌                                                \n      2
// 2     2 <= 3✅   C      3       1     1 <= 3✅   16C3    2         B        5         2
//                                 2     2 <= 3✅   25B2    1         A        6         3
//                                 3     3 <= 3✅   36A1    0         @        7         4
//                                 4     4 <= 3❌                                                \n      3
// 3     3 <= 3✅   C      3       1     1 <= 3✅   49C3    2         B        8         2
//                                 2     2 <= 3✅   64B2    1         A        9         3
//                                 3     3 <= 3✅   81A1    0         @        10         4
//                                 4     4 <= 3❌                                                \n      4
// 4     4 <= 3❌ (END)
