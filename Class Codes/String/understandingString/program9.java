// In case of String '==' operator checks the Address(identityHashCode) not the value at Address like Address(obj of str1) == Address(obj of str2)
// where as equals method compaires content of obj ex. str1.equals(str2);

class StrDemo {
	public static void main(String[] args) {
		String str1 = "Same String";
		String str2 = new String("Same String");

		System.out.println("Test 1 using '==' operator: ");
		if(str1 == str2)
			System.out.println("True 1");
		else
			System.out.println("False");

		System.out.println("Test 2 using equals method: ");
		if(str1.equals(str2))
			System.out.println("True 2");
		else
			System.out.println("False");

	}
}
