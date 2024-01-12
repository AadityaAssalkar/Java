// Method 6: public synchronized int length();

// Description:
// - Get the length of the String this StringBuffer would create.
// Not to be confused with the capacity of the StringBuffer.

// Parameters: No Parameter
// return type: Integer(the length of this StringBuffer).

class MyLength {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Core2Web");
		System.out.println(str1.length());
	}
}
