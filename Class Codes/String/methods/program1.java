// Method 1:
// public String concat(String str);

// Description:
// - concatenate String to this String i.e. Another Sring is concatenated with the first String.
// - Implements new Array of character whose length si sum of str1.length and str2.length

// Parameters: String
// retrun type: String

class ConcatDemo {
	public static void main(String[] args) {
		String str1 = "Core2";
		String str2 = "Web";

		String str3 = str1.concat(str2);
		System.out.println(str3); // Core2Web
	}
}
