// Method 7: public synchronized int indeOf(String str, int fromIndex)

// Description:
// - Finds the first instance of a String in this StringBuffer, starting at a given index.
// - If the starting index is less than 0, the search starts at the beinning of this String.
// - If the starting index is greater than the length of this String, or the substring is not found, -1 is returned

// parameters:
// - String(str String to find),
// - Integer(formIndex index to start the search).
// return type: Integer(location(base 0) of the String, or -1 if not found).

class indexOfDemo {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Core2Web");
		System.out.println(str1.indexOf("e"));
	}
}
