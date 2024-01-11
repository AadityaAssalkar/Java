// to check the memory location of string we can use identityHashCode

class StrDemo {
	public static void main(String[] args) {
		String str1 = "Core2web"; // SCP
		String str2 = new String("Core2web"); // Heap

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));

		String str3 = "Core2web"; // SCP - this will be same as str1
		String str4 = new String("Core2web"); // Heap

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
