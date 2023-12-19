class Demo {
	int x = 10;
	static int y = 5;
	public static void main(String[] args) {
		Demo obj = new Demo();
		System.out.println(obj.x);
		System.out.println(y);
		obj.gun();
		fun();
	}

	static void fun() {
		System.out.println("In fun");
	}

	void gun() {
		System.out.println("In gun");
	}
}
