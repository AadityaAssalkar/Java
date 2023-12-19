class Demo {
	void fun(int x) {// error: 'void' type not allowed here
		int y = x + 10;
	}

	public static void main(String args[]) {
		Demo obj = new Demo();
		System.out.println(obj.fun(10));
	}
}
