// Write a program to count the digits of the given number.
// Input: 942111423  Output: 9

class Demo{
	public static void main(String[] args){
		int count = 0;

		for(int num = 942111423; num != 0; num = num/10){
			count++;
		}
		System.out.println(count);
	}
}

// Dry Run:

// num        num != 0        num = num/10     count
//
// 942111423  942111423 != 0  94211142	       1
// 94211142   94211142  != 0  9421114	       2
// 9421114    9421114   != 0  942111	       3
// 942111     942111    != 0  94211	       4
// 94211      94211     != 0  9421	       5
// 9421       9421      != 0  942	       6
// 942        942       != 0  94	       7
// 94         94        != 0  9		       8
// 9          9         != 0  0		       9
// 0          0 != 0(false)
