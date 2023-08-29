// Optimized Prime Number Code

class Demo {
	public static void main(String[] args) {
		int N = 15;
		int count = 0;

		for(int i = 1; i <= N; i++) {
			if(N%i == 0) {
				count++;
			}
			if(count > 2) {
				break;
			}
		}
		if(count == 2) {
			System.out.println("Prime number");
		} else {
			System.out.println("Not Prime");
		}
	}
}

// Dry Run:

// i     i <= N     N%i == 0     count++     count > 2     i++     if/else
// 1	 1 <= 15    true	 1	     false	   2	   
// 2	 2 <= 15    false	 	     false	   3	   
// 3	 3 <= 15    true	 2	     false	   4	   
// 4	 4 <= 15    false	 	     false	   5	   
// 5	 5 <= 15    true	 3	     true(break)	   else
