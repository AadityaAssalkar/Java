// Method 6:
// public boolean equals(Object anObject)

// Description:
// - Predicate which compares and Object to this. This is true only for Strings with the same character sequence.
// - returns true if anObject is semantically equal to this.

// parameters: Object (anObject).
// return type: boolean


class EqualsDemo {
	public static void main(String[] args) {
		String str1 = "Shashi";
		String str2 = new String("Shashi");
		System.out.println(str1.equals(str2)); // true
	}
}
