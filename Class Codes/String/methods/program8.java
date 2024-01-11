// Method 8:
// public boolean startsWith(String prefix, int toffset);

// Description:
// - predicate which determines if the given String contains the given prefix
// beginning comparison at toffset
// - The result is false if the toffset is negative or greater than str.length().

// parameters: prefix String to compare, toffset offset fro this string where the comparison Starts.
// return type: boolean

class StartsWith {
	public static void main(String[] args) {
		String str = "Core2Web";
		System.out.println(str.startsWith("or", 1));
	}
}
