class StrBuffer {
	public static void main(String[] args) {
		String str1 = "Shashi";
		String str2 = new String("Bagal");
		StringBuffer str3 = new StringBuffer("Core2Web");
		
		//String str4 = str1.concat(str3); // error: concat(String) it does not take other arguments than String
		StringBuffer str5 = str3.append(str2);

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		//System.out.println(str4);
		System.out.println(str5);
	}
}
