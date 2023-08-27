// Take N as input, print whether N is Armstrong number or not
// Input: 23     Output: Not an Armstrong number
// Input: 153    Output: Armstrong number
// Defination: Armstrong number are the numbers whose sum of cube of each digit is equal to that number itself

class Demo {
	public static void main(String[] args) {
		int N = 153;
		int sum = 0;
		int temp;

		for(int copy = N; copy != 0; copy = copy/10) {
			temp = copy%10;
			sum = sum + (temp*temp*temp);
		}
		if(sum == N) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}
}


// Dry Run:

// copy     copy != 0     temp     sum     copy = copy/10     sum == N
// 153	    true	  3	   27	   15
// 15	    true	  5	   152	   1
// 1	    true	  1	   153	   0
// 0	    false	  	   	   		      true(End)
