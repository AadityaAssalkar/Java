// Take N as input, print all its factors
// x is factor of N if N%x == 0
// Input: 6     Output: 1 2 3 6
// Input: 24    Output: 1 2 3 4 6 8 12 24

class Demo {
	public static void main(String[] args) {
		int N = 6;

		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				System.out.print(i + " ");
			}
		}
	}
}


// Dry Run:

// i     i <= N     N%i == 0     sop     i++
// 1	 1 <= 6	    true	 1	 2
// 2	 2 <= 6	    true	 2	 3
// 3	 3 <= 6	    true	 3	 4
// 4	 4 <= 6	    false	  	 5
// 5	 5 <= 6	    false	  	 6
// 6	 6 <= 6	    true	 6	 7
// 7	 7 <= 6(false)
// End
