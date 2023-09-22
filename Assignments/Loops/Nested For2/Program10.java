// Write a program to print the following pattern

// F    5    D    3    B    1
// F    5    D    3    B    1
// F    5    D    3    B    1
// F    5    D    3    B    1
// F    5    D    3    B    1
// F    5    D    3    B    1

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 6; i++) {
//	for(int j = 1; j <= 6; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 6; i++) {
			int num = 6;
			char ch = 'F';
			for(int j = 1; j <= 6; j++) {
				if(j%2 == 1) {
					System.out.print(ch + "    ");
				} else {
					System.out.print(num + "    ");
				}
				ch--;
				num--;
			}
			System.out.println();
		}
	}
}


// Dry Run:

// num = 6, ch = F
// i     i <= 6     j     j <= 6     sop     ch--     num--     j++     sop     i++
// 1     1 <= 6✅   1     1 <= 6✅   F       E        5         2
//                  2     2 <= 6✅   5       D        4         3
//                  3     3 <= 6✅   D       C        3         4
//                  4     4 <= 6✅   3       B        2         5
//                  5     5 <= 6✅   B       A        1         6
//                  6     6 <= 6✅   1       @        0         7
//                  7     7 <= 6❌                                      \n      2
// 2     2 <= 6✅   1     1 <= 6✅   F       E        5         2
//                  2     2 <= 6✅   5       D        4         3
//                  3     3 <= 6✅   D       C        3         4
//                  4     4 <= 6✅   3       B        2         5
//                  5     5 <= 6✅   B       A        1         6
//                  6     6 <= 6✅   1       @        0         7
//                  7     7 <= 6❌                                      \n      3
// 3     3 <= 6✅   1     1 <= 6✅   F       E        5         2
//                  2     2 <= 6✅   5       D        4         3
//                  3     3 <= 6✅   D       C        3         4
//                  4     4 <= 6✅   3       B        2         5
//                  5     5 <= 6✅   B       A        1         6
//                  6     6 <= 6✅   1       @        0         7
//                  7     7 <= 6❌                                      \n      4
// 4     4 <= 6✅   1     1 <= 6✅   F       E        5         2
//                  2     2 <= 6✅   5       D        4         3
//                  3     3 <= 6✅   D       C        3         4
//                  4     4 <= 6✅   3       B        2         5
//                  5     5 <= 6✅   B       A        1         6
//                  6     6 <= 6✅   1       @        0         7
//                  7     7 <= 6❌                                      \n      5
// 5     5 <= 6✅   1     1 <= 6✅   F       E        5         2
//                  2     2 <= 6✅   5       D        4         3
//                  3     3 <= 6✅   D       C        3         4
//                  4     4 <= 6✅   3       B        2         5
//                  5     5 <= 6✅   B       A        1         6
//                  6     6 <= 6✅   1       @        0         7
//                  7     7 <= 6❌                                      \n      6
// 6     6 <= 6✅   1     1 <= 6✅   F       E        5         2
//                  2     2 <= 6✅   5       D        4         3
//                  3     3 <= 6✅   D       C        3         4
//                  4     4 <= 6✅   3       B        2         5
//                  5     5 <= 6✅   B       A        1         6
//                  6     6 <= 6✅   1       @        0         7
//                  7     7 <= 6❌                                      \n      7
// 7     7 <= 6❌ (END)
