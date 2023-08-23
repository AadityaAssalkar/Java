// Write a java program to check if a number is even or odd
// Input: var = 10; Output: 10 is an even no
// Input: var = 37; Output: 37 is an odd no
// Input: var = 0;  Output: 0 is an even no

class Demo{
	public static void main(String[] args){
		int var = 0;

		if(var%2 == 0){
			System.out.println(var + " is an even no");
		} else {
			System.out.println(var + " is an odd no");
		}
	}
}
