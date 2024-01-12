class StrBuffer {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Shashi"); // StringBuffer

		System.out.println(System.identityHashCode(str1)); // 100
		str1.append("Bagal"); // appends and return result to str1
	
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1)); // 100
	}
}
