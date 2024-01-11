// Method 13:
// public String substring(int index);

// Description:
// - creates a substring of the given String starting at a specified index and ending at the end of given String

// parameters: integer (index of the String).
// return type: String

class SubstringDemo {
	public static void main(String[] args) {
		String str = "Core2Web Tech";
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 3));
	}
}
