// Practice code-3

// Take two integers A and B as input
// Print the max of two
// Input1: x = 5, y = 5   ;   Input2: x = 5, y = 7
// Output1: Both are equal;   Output2: 7 is greater

class Demo{
	public static void main(String[] args){
		int x = 5;
		int y = 7;

		if(x != y){
			if(x > y){
				System.out.println(x + " is greater");
			} else {
				System.out.println(y + " is greater");
			}
		} else {
			System.out.println("Both are equal");
		}
	}
}
