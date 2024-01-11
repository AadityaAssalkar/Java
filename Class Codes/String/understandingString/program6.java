class StrDemo {
	public static void main(String[] args) {
		String str1 = "Shashi";
		String str2 = "Bagal";

		String str3 = str1 + str2; // this operation first call new String() then uses append method of StringBuilder class to concat
		String str4 = str1.concat(str2); // that means the two of these operations are different rather gives same output

		System.out.println(str3); // ShashiBagal
		System.out.println(str4); // ShashiBagal
	}
}
