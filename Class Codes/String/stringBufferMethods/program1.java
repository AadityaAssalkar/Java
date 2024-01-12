// Method 1: public synchronized StringBuffer append(String str);

// Description: 
// - Append the String to this StringBuffer.
// - If str is null, the String "null" is appended

// parameterss: String(str the String to append).
// return type: StringBuffer(this StringBuffer).

class MyAppend {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Hello");
		String str2 = "World";

		str1.append(str2);
		System.out.println(str1);
	}
}
