// Take N as input, print its factorial
// Input: 5     Output: 120
// Input: 4     Output: 24

class Demo {
	public static void main(String[] args) {
		int N = 5;
		int fact = 1;

		for(int i = 1; i <= N; i++) {
			fact = fact*i;
		}
		System.out.print(fact);
	}
}


// Dry Run:

// i     i <= N     fact     i++     sop
// 1	 1 <= 5	    1	     2
// 2	 2 <= 5	    2	     3
// 3	 3 <= 5	    6	     4
// 4	 4 <= 5	    24       5
// 5	 5 <= 5	    120	     6
// 6	 6 <= 5(false)
// 				     120
// 				     End
