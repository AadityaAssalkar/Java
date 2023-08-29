// Write a program to check whether the number is a Palindrome number or not.
// Input: 2332  Output: 2332 is a palindrome number

class Demo{
	public static void main(String[] args){
		int i = 2332;
		int rev = 0;

		for(int copy = i; copy != 0; copy = copy/10){
			rev = rev*10 + (copy%10);
		}

		if(i == rev){
			System.out.println(i + " is a palindrome number");
		} else{
			System.out.println(i + " is not a palindrome number");
		}
	}
}

// Dry Run:

// copy != 0     rev     copy
// true		 2	 233
// true		 23	 23
// true		 233	 2
// true		 2332	 0
// false(end)
//
// i == rev(true/false) END
