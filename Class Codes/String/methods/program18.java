// Method 18:
//  public String[] split(String delimiter)

// Description:
// splits this string around matches of regular expressions.

// parameters: delimiter(pattern to match)
// return type: String[] (array of split Strings)

class MySplit {
	public static void main(String[] args) {
		String str = "Know The Code Till The Core";
		String[] strResult = str.split(" ");

		for(String x : strResult)
			System.out.println(x);
	}
}
