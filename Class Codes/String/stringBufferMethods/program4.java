// Method 4: public synchronized StringBuffer reverse();

// Description: 
// - Reverse the characters in this StringBuffer.
// - The same sequence of characters exists, but in the reverse index ordering.

// Parameters: No Parameter
// return type: StringBuffer(this StringBuffer)

class ReverseDemo {
	public static void main(String[] args) {
		String str1 = "Core2Web";
		StringBuffer sb2 = new StringBuffer(str1);
		str1 = sb2.reverse().toString();
		System.out.println(str1);
	}
}
