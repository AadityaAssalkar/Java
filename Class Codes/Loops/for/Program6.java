// Take N as input, print whether its prime or not
// Input: 5     Output: Prime
// Input: 8     Output: Not a Prime
// Defination: Prime number are those numbers who has exactly two factors

class Demo {
	public static void main(String[] args) {
		int N = 8;
		int count = 0;

		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("Prime");
		} else{
			System.out.println("Not a Prime");
		}
	}
}


// Dry Run:

// i     i <= 5     N%i == 0     count     i++     count == 2
// 1	 1 <= 5	    true	 1	   2
// 2	 2 <= 5	    false	 	   3
// 3	 3 <= 5	    false	 	   4
// 4	 4 <= 5	    false	 	   5
// 5	 5 <= 5	    true	 2	   6
// 6	 6 <= 5(false)				   true(End)
