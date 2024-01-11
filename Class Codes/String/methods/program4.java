// Method 4:
// public int compareTo(String str2);

// Description: 
// it compares the str1 and str2 (case sensitive), if both the strings are equal, it returns 0 otherwise returns the comparison.
// ex. str1.compareTo(str2).

// Parameters: String (second string).
// return type: integer

// if Both strings are equal = 0
// if Both strings are not equal = difference

class CompareToDemo {
	public static void main(String[] args) {
		String str1 = "Ashish";
		String str2 = "Ashash";

		System.out.println(str1.compareTo(str2));
	}
}
