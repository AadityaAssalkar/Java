// Write a program to print the product of the first 10 numbers

class Demo {
	public static void main(String[] args) {
		int N = 10;
		int product = 1;

		for(int i = 1; i <= N; i++) {
			product = product*i;
		}
		System.out.print(product);
	}
}
