// Method 9:
// public boolean endsWith(String suffix);

// Description:
// - predicate which determines if the string ends with given suffix
// - if the suffix is an empty String, true is returned.
// - throws NullPointerException if suffix is null

// parameter: prefix String to compare
// return type: boolean

class MyEndsWith {
	public static void main(String[] args) {
		String str1 = "Know the code till the core";
		System.out.println(str1.endsWith("core"));
	}
}
