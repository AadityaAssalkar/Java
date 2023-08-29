// Take N as input, print whether N is Armstrong number or not
// Input: 23     Output: Not an Armstrong number
// Input: 153    Output: Armstrong number
// Defination: Armstrong number are the numbers whose sum of number of digits' power of each digit is equal to that number itself

class Demo {
	public static void main(String[] args) {
		int N = 153;
		int sum = 0;
		int rem;
		int count = 0;

		for(int c = N; c != 0; c = c/10) {
			count++;
		}

		for(int i = N; i != 0; i = i/10) {
			rem = i%10;
			int mult = 1;
			for(int j = 1; j <= count; j++) {
				mult = mult*rem;
			}
			sum = sum + mult;
		}
		if(sum == N) {
			System.out.println("Armstrong number");
		} else {
			System.out.println("Not an Armstrong number");
		}
	}
}
