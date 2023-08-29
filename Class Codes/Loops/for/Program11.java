// print numbers 1-40 break loop if number is divisible by 3 and 5

class Demo {
	public static void main(String[] args) {
		int N = 40;

		for(int i = 1; i <= N; i++) {
			if(i%3 == 0 && i%5 == 0) {
				break;
			}
			System.out.println(i);
		}
	}
}


// Dry Run:

// i     i <= N     if     sop     i++
// 1	 1 <= 40    false  1	   2
// 2	 2 <= 40    false  2	   3
// 3	 3 <= 40    false  3	   4
// 4	 4 <= 40    false  4	   5
// 5	 5 <= 40    false  5	   6
// 6	 6 <= 40    false  6	   7
// 7	 7 <= 40    false  7	   8
// 8	 8 <= 40    false  8	   9
// 9	 9 <= 40    false  9	   10
// 10	 10 <= 40   false  10	   11
// 11	 11 <= 40   false  11	   12
// 12	 12 <= 40   false  12	   13
// 13	 13 <= 40   false  13	   14
// 14	 14 <= 40   false  14	   15
// 15	 15 <= 40   true(break)
