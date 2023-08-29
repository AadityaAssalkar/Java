// Write a program to print the sum of the first 10 numbers

class Demo {
	public static void main(String[] args) {
		int N = 10;
		int sum = 0;

		for(int i = 1; i <= N; i++) {
			sum = sum + i;
		}
		System.out.print(sum);
	}
}
