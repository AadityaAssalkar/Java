// Take N as input, count all itts factors and print count
// Input: 6     Output: 4
// Input: 24    Output: 8

class Demo {
	public static void main(String[] args) {
		int N = 24;
		int count = 0;

		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				count++;
			}
		}
		System.out.print(count);
	}
}


// Dry Run:

// N = 6
// i     i <= N     N%i == 0     count     i++     sop
// 1	 1 <= 6     true	 1	   2
// 2	 2 <= 6     true	 2	   3
// 3	 3 <= 6     true	 3	   4
// 4	 4 <= 6     false	 	   5
// 5	 5 <= 6     false	 	   6
// 6	 6 <= 6     true	 4	   7
// 7	 7 <= 6(false)				   4
// End
