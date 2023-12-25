// Command Line Arguments: passing arguments from command line when run code using command - java Demo arg1 arg2 ...
// works like arguments passing of function
// number of arguments equal to length of array

class Demo {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
