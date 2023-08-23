// Practice code-1

// Take an integer N as input
// Print odd integers from 1 to N using loop
// Input: 10; Output: 1 3 5 7 9

class Demo{
	public static void main(String[] args){
		int N = 10;
		int i = 1;

		while(i <= N){
			if(i%2 == 1){// this can be done without if by sop(i) and increment i by 2 as 'i = i +2;'
				System.out.println(i);
			}
			i++;
		}
	}
}
