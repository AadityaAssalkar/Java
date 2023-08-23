// Write a java program, take a number, and print whether it is less than 10 or greater than 10.
// Input: var = 5;  Output: 5 is less than 10.
// Input: var = 16; Output: 16 is greater than 10.
// Input: var = 10; Output: 

class Demo{
	public static void main(String[] args){
		int var = 5;

		if(var > 10){
			System.out.println(var + " is greater than 10");
		} else if(var < 10){
			System.out.println(var + " is less than 10");
		} else {
			System.out.println(var + "is equal to 10");
		}
	}
}
