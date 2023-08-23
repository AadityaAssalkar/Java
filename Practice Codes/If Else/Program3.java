// Write a java program, take a number, and print whether it is positive or negative.
// Input: num = 5;  Output: 5 is a positive number
// Input: num = -9; Output: -9 is a negative number
// Input: num = 0;  Output: ????

class Demo{
	public static void main(String[] args){
		int num = 0;

		if(num > 0){
			System.out.println(num + " is a positive number");
		} else if(num < 0){
			System.out.println(num + " is a negative number");
		} else{
			System.out.println(num + " is neither negative nor positive");
		}
	}
}
