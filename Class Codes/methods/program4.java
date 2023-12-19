class Demo {
	public static void main(String args[]) {
		Demo obj = new Demo();

		obj.fun(23); // without f as sufix its a double
		obj.fun(10.5f);
		obj.fun('A'); // java reads caracter as int(ASCII values) that can be converted to float
		//obj.fun(true); // error: Incompatible type, boolean can't be converted to float
	}

	void fun(float x) {
		System.out.println("In fun");
		System.out.println(x);
	}
}
