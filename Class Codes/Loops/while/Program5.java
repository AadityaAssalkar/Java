// Practice code-4

// Given an integer N
// Print all its digits
// Input: 6531

class Demo{
	public static void main(String[] args){
		int N = 6531;

		while(N != 0){
			System.out.println(N%10);
			N = N/10;
		}
	}
}
