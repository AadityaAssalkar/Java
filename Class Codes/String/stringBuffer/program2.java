// Default capacity of StringBuffer is 16 character or 16 + number of character in string at the instatnce of string creation

class StrBuffer {
	public static void main(String[] args) {
		StringBuffer str1 = new StringBuffer("Shashi");
		System.out.println(str1.capacity()); // 22
	}
}
