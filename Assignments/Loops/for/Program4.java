// Write a program to print even numbers 1-100

class Demo {
	public static void main(String[] args) {
		int start = 1;
		int end = 100;

		for(int i = start; i <= end; i++) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
}
