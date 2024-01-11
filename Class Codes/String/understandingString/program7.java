// HashCode is the code derived using hash table for the object that means it is same for same content even for different obj having same content
// while identityHashCode is the unique value of an object

class StrDemo {
	public static void main(String[] args) {
		String str1 = "Shashi";
		String str2 = new String("Shashi");
		String str3 = "Shashi";
		String str4 = new String("Shashi");

		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		System.out.println(str3.hashCode());
		System.out.println(str4.hashCode());

		
		System.out.println("identityHashCode");

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
	}
}
