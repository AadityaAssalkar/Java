// Method 5:
// public int compareToignoreCase(String str);

// Description:
// it compares str1 and str2(case insensitive).

// parameters: String
// return type: int

class Compareignore {
	public static void main(String[] args) {
		String str1 = "SHASHI";
		String str2 = "shashikant";

		System.out.println(str1.compareToIgnoreCase(str2)); // 0 expected
	}
}
