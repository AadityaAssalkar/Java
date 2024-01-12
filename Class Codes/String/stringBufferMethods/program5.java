// Method 5: public String toString();

// Description:
// - Convert this StringBuffer to a String.
// - The String is composed of the characters currently in this StringBuffer.
// - Note that the result is a copy, and that future modifications to this buffer do not affect the String.

// Parameters: No Parameter
// return type: String(the characters in this StringBuffer).

class ToStringDemo {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Know The Code Till The Core");
		String str2 = "Core2Web:";
		String str3 = str1.toString();
		String str4 = str2.concat(str3);
		System.out.println(str4);
	}
}
