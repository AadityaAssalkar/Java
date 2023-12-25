class Demo {
	static void fun(int x, int y) {	// this x and y are different than from main method's therefore
		System.out.println(x);
		System.out.println(y);

		x = x + 10; // this will only reflect inside fun()
		y = y + 10;

		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		int x = 10;
		int y = 20;
	
		System.out.println(x);
		System.out.println(y);

		fun(x, y);

		System.out.println(x);
		System.out.println(y);
	}
}
