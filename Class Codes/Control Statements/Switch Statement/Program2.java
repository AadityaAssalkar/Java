// In switch statement case label must be constatnt value

class Demo{
	public static void main(String[] args){
		int x = 4;
		switch(x){
			default: // Least Priority
				System.out.println("No match");
				break;
			case 1:
				System.out.println("One");
				break;
			case 2:
				System.out.println("Two");
				break;
			case 3:
				System.out.println("Three");
				break;
			case 4:
				System.out.println("Four");
				break;
			case 5:
				System.out.println("Five");
				break;
		} // Here ';' is optional
		System.out.println("After switch");
	}
}
