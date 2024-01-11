// when obj comes with string it aquires toString() method

class StrDemo {
	public static void main(String[] args) {
		int a = 2;
		int b = 3;

		System.out.println("Hello " + a + " is now a string not a number"); // here string appears before the obj therefore it will follow the above rule
		System.out.println(b + " but here 3 is not a string its integer"); // here string appears after the obj therefore it will not follow the above rule
	}
}
