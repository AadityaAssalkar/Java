// Take intege N as input, print whether N is perfect number or not
// Input: 4     Output: Not a perfect number
// Input: 6     Output: perfect number
// Defination: Perfect number are those numbers whose sum of factors(except that number itself) is equal to that number itself

class Demo {
	public static void main(String[] args) {
		int N = 4;
		int sum = 0;

		for(int i = 1; i < N; i++) {
			if(N%i == 0) {
				sum = sum + i;
			}
		}
		if(sum == N) {
			System.out.println("Perfect number");
		} else {
			System.out.println("Not a perfect number");
		}
	}
}


// Dry Run:

// i     i < N     N%i == 0     sum     i++     sum == N
// 1	 1 < 4	    true	 1	 2
// 2	 2 < 4	    true	 3	 3
// 3	 3 < 4	    false	 	 4
// 4	 4 < 4(false)				false(End)
