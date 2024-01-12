// Method 9: public synchronized StringBuffer replace(int start, int end, String str);

// Description:
// - Replace characters between index start(inclusive) and end (exclusive) with str.
// - If end is larger than the size of this StringBuffer, all characters after start are replaced.

// Parameters: 
// - Integer(start the beginning index of characters to delete(inclusive)),
// - Integer(end the beginning index of characters to delete(exclusive)),
// - String(str the new String to insert).
// return type: StringBuffer(this StringBuffer).

class ReplaceDemo {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Know The Code Untill The Core");
		System.out.println(str1);
		str1.replace(14, 20, "Till");
		System.out.println(str1);
	}
}
