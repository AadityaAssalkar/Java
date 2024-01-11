// Method 10:
// public int indexOf(int ch, int formindex);

// Description:
// finds the first instance of the charater in the given String

// parameterss: character(ch to find) integer (index to start the search).
// return type: int

class IndexOfDemo {
	public static void main(String[] args) {
		String str1 = "Shashi";

		System.out.println(str1.indexOf('h', 0));
		System.out.println(str1.indexOf('h', 1));
		System.out.println(str1.indexOf('h', 2));
	}
}
