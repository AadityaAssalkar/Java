// loop 1-40 print it and break if its divisible by 3

class Demo {
	public static void main(String[] args) {
		int N = 40;

		for(int i = 1; i <= 40; i++) {
			if(i%3 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}


// Dry Run:

// i     i <= 40     i%3 == 0     sop     i++
// 1	 1 <= 40     false	  1	  2
// 2	 2 <= 40     false	  2	  3
// 3	 3 <= 40     true(break)
