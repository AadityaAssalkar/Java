// Write a program to print the following pattern

// A    b    C    d    
// E    f    G    h    
// I    j    K    l    
// M    n    O    p    

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 4; i++) {
//	for(int j = 1; j <= 4; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		char ch1 = 'A';
		char ch2 = 'a';
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(j%2 == 1) {
					System.out.print(ch1 + "    ");
				}
				else {
					System.out.print(ch2 + "    ");
				}
				ch1++;
				ch2++;
			}
			System.out.println();
		}
	}
}


// Dry Run:

// i     i <= 4     j     j <= 4     body     ch1++     ch2++     j++     sop     i++
// 1     1 <= 4✅   1     1 <= 4✅   A        B         b         2
//                  2     2 <= 4✅   b        C         c         3
//                  3     3 <= 4✅   C        D         d         4
//                  4     4 <= 4✅   d        E         e         5
//                  5     5 <= 4❌                                        \n      2
// 2     2 <= 4✅   1     1 <= 4✅   E        F         f         2
//                  2     2 <= 4✅   f        G         g         3
//                  3     3 <= 4✅   G        H         h         4
//                  4     4 <= 4✅   h        I         i         5
//                  5     5 <= 4❌                                        \n      3
// 3     3 <= 4✅   1     1 <= 4✅   I        J         j         2
//                  2     2 <= 4✅   j        K         k         3
//                  3     3 <= 4✅   K        L         l         4
//                  4     4 <= 4✅   l        M         m         5
//                  5     5 <= 4❌                                        \n      4
// 4     4 <= 4✅   1     1 <= 4✅   M        N         n         2
//                  2     2 <= 4✅   n        O         o         3
//                  3     3 <= 4✅   O        P         p         4
//                  4     4 <= 4✅   p        Q         q         5
//                  5     5 <= 4❌                                        \n      5
// 5     5 <= 4❌ (END)
