// Method 10: public synchronized String substring(int beginIndex, int endIndex);

// Description:
// - Creates a substring of this StringBuffer, starting at a specified index and ending at one character before a specified index.

// parameters:
// - Integer(beginIndex index to start at (inclusive, base 0)),
// - Integer (endIndex index to end at (exclusive)),
// - String(str the new String to insert).
// return type: String(new String which is a substring of this StringBuffer).

class SubstringDemo {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Know The Code Till The Core");
		String str2 = str1.substring(14, 27);
		System.out.println(str2);
	}
}
