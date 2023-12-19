class Demo {
	void fun(int x) {
		int y = x + 10;
	}

	public static void main(String args[]) {
		Demo obj = new Demo();
		int a = obj.fun(10); // error: Incompatible types: void cannot be converted to int
		System.out.println(a);
	}
}
