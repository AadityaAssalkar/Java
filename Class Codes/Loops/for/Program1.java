// Take N as input, print from 1 to N
// Input: 5     Output: 1 2 3 4 5

class Demo{
	public static void main(String[] args) {
		int N = 5;

		for(int i = 1; i <= N; i++) {
			System.out.print(i + " ");
		}
	}
}


// Dry Run:

// i     i <= N     sop     i++
// 1     1 <= 5     1       2
// 2     2 <= 5     2       3
// 3     3 <= 5     3       4
// 4     4 <= 5     4       5
// 5     5 <= 5     5       6
// 6     6 <= 5(false)
// End
