// case label are compulsarily constant any expression are not allowed
// To make this code work we must declare the variables used as labels as 'final'

class Demo{
	public static void main(String[] args){
		int x = 3;
		int a = 1;
		int b = 2;
		
		switch(x){
			case a:
				System.out.println("1");
				break;
			case b:
				System.out.println("2");
				break;
			case a+b: // Error: constant expression required, as a and b are variables
				System.out.println("3");
				break;
			case a+a+b: // Error
				System.out.println("4");
				break;
			case a+b+b: // Error
				System.out.println("5");
				break;
			default:
				System.out.println("Invalid");
				break;
		};
	}
}
