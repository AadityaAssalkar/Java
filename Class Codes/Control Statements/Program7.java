// Practice code-7

// Given an integer value as input
// Print Fizz if it is divisible by 3
// Print Buzz if it is divisible by 5
// Print Fizz-buzz if it is divisible by both
// If not then print "Not divisible by both"


class Program{
	public static void main(String[] args){
		int x = 15;

		if((x%3 == 0) && (x%5 == 0)){
			System.out.println("Fizz-buzz");
		} else if(x%3 == 0){
			System.out.println("Fizz");
		} else if(x%5 == 0){
			System.out.println("Buzz");
		} else{
			System.out.println("Not divisible by both");
		}

	}
}
