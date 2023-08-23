// Practice code-7

// Take an integer N as input
// Print perfect squares till N
// Input: 30; Output: 1 4 9 16 25

class Demo{
	public static void main(String[] args){
		int N = 30;
		int i = 1;

		while(i*i <= N){
			System.out.println(i*i);
			i++;
		}
	}
}
