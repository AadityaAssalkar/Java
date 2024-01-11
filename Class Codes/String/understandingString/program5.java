// Concatination

class StrDemo {
	public static void main(String[] args) {
		String str1 = "Aaditya";
		String str2 = "Assalkar";

		System.out.println(str1 + str2); // this is similar to sop(str1.concat(str2));
		String str3 = "Aaditya Assalkar";
	
		String str4 = str1 + str2;

		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
