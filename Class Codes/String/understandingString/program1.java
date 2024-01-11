class StrDemo {
	public static void main(String[] args) {
		String str1 = "Core2Web"; // SCP(String constant pool)
		// this strings are unique and only one obj is created on SCP for same String

		String str2 = new String("Core2Web"); // Heap
		// string created using new keyword get new memory on heap everytime even if they are same

		char str3[] = {'C', '2', 'W'}; // Heap

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
