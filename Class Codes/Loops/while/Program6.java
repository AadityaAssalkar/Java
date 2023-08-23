// Practice code-5

// Given an integer N
// Print sum of its digits
// Assume: N >= 0
// Input: 6531; Output: 15

class Demo{
	public static void main(String[] args){
		int N = 6531;
		int sum = 0;

		while(N != 0){
			int temp = N%10;
			N = N/10;
			sum = sum + temp;
		}
		System.out.println(sum);
	}
}
