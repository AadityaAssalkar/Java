// if statement

// Practice code-1

class Program{
	public static void main(String[] args){
		int x = 10;
		if (x > 5) // if 'if' does not have block braces {} then it will only execute one statement
			System.out.println("Greater than 5");
			System.out.println("Greater than 7");	// this will print always like a normal sop of a method
		else
			System.out.println("Else block");  // error cause else will not find if block

		// Following is allowed
		if (true)
			System.out.println("if block without {}");
		else
			System.out.println("else block without {}");
	}
}
