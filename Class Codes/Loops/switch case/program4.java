class Demo {
	public static void main(String[] args) {
		int ch = 65;
		switch(ch) {
			case 'A': System.out.println("char - A"); break;
			case 65 : System.out.println("Num - 65"); break; // Duplicase case: since char are read by their ASCII value by java compiler
			case 'B': System.out.println("char - B"); break;
			case 66 : System.out.println("Num - 66"); break;
			default : System.out.println("Invalid"); break;
		};
	}
}
