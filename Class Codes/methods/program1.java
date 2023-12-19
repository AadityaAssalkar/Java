class Demo {
	public static void main(String[] args) {
		fun();
		gun(); // error: non static method gun() cannot be reference from a static context
	}

	static void fun() {
		System.out.println("In fun");
	}

	void gun() {
		System.out.println("In gun");
	}
}
