// Method 2: public synchronized StringBuffer insert(int offset, String str);

// Description: 
// - Insert the String argument into this StringBuffer.
// - If str is null, the String "null" is used instead.

// parameters: 
// - Integer (offset the place to insert in this buffer),
// - String(str the String to insert).
// return type: StringBuffer(this StringBuffer).

class SBDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("ShashiCore2Web");

		System.out.println(sb);
		sb.insert(6, "Bagal");
		System.out.println(sb);
	}
}
