// Practice code-6

// Given an integer N
// Print multiplication of its digits
// Assume: N >= 0
// Input: 135; Output: 15

class Demo{
	public static void main(String[] args){
		int N = 135;
		int multi = 1;

		while(N != 0){
			int temp = N%10;
			N = N/10;
			multi = multi * temp;
		}
		System.out.println(multi);
	}
}
