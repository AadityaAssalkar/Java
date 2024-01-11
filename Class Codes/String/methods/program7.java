// Method 7:
// public boolean equalsignoreCase(String anotherString);

// Description:
// compares a String to this String ignoring case.

// parameters: String(str2)
// return type: boolean

class MyEqualsIgnoreCase {
	public static void main(String[] args) {
		String str1 = "Core2Web";
		String str2 = "core2web";
		System.out.println(str1.equalsIgnoreCase(str2));
	}
}
