// Method 12:
// public String replace(char oldChar, char newChar);

// Descrition:
// replaces every instance of a character in the given String with a new character.

// paramters: character(old character), character(new Character).
// return type: String

class MyReplace {
	public static void main(String[] args) {
		String str = "Hello World";
		String result = str.replace('e', 'a');
		System.out.println(result);
	}
}
