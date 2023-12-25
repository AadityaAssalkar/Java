// Variable Arguments: implements using ellipsis(...) 
// can pass any number of arguments
// number of arguments equal to length of array, to check usr sop(args.length)
// arguments can only be string to operate on any input numbers of another type we need to parse it in code
// since special characters(such as @, #, $, %, ...) have meaning in command line they should be pass as string using double inverted commas
// e.g.: java Demo "&"

class Demo {
	public static void main(String ... args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
	}
}
