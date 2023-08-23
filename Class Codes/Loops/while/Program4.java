// Practice code-3

// Take an integer N as input
// Print multiples of 4 till N
// Input: 22; Output: 4 8 12 16 20

class Demo{
	public static void main(String[] args){
		int N = 22;
		int i = 1;
		while(i*4 <= N){
			System.out.println(i*4);
			i++;
		}
	}
}
