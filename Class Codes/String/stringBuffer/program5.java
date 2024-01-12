class StrBuffer {
	public static void main(String[] args) {
		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2Web");

		//String str4 = str1.append(str3); // error: cannot find symbol as append belong to StringBuffer class not String
		//String str5 = str3.append(str1); // error: incompatible type StringBuffer cannot be converted to String
		// here str3.append(str1) goes as -> new StringBuffer("Core2Web");
		StringBuffer str6 = str3.append(str1);

		System.out.println(str1); // Shashi
		System.out.println(str2); // Bagal
		System.out.println(str3); // Core2WebShashi (because append method returns and store the value in str3[first given string])
		//System.out.println(str4);
		//System.out.println(str5);
		System.out.println(str6); // Core2WebShashi
	}
}
