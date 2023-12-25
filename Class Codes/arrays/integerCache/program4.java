class Demo {
	static void fun(int x, double y) {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		System.out.printnl(fun(10, 20.5)); // error: 'void' type not allowed here
	}
}
