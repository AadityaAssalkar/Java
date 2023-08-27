// Take N as an input, print odd integers from 1 to N
// Input: 6     Output: 1 3 5

class Demo {
	public static void main(String[] args) {
		int N = 6;

		for(int i = 1; i <= N; i++) {
			if(i%2 == 1) {
				System.out.print(i + " ");
			}
		}
	}
}


// Dry Run:

// i     i <= N     i%2 == 1     sop     i++
// 1	 1 <= 6	    true	 1	 2
// 2	 2 <= 6	    false	 	 3
// 3	 3 <= 6	    true	 3	 4
// 4	 4 <= 6	    false	 	 5
// 5	 5 <= 6	    true	 5	 6
// 6	 6 <= 6	    false	 	 7
// 7	 7 <= 6(false)
