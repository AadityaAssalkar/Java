// similar to integer cache there is String constant pool which belongs to String class to store and reference unique string values

class Array{
	public static void main(String[] args) {
		String[] arr = {"Ashish", "Ashish"};

		System.out.println(System.identityHashCode(arr[0]));
		System.out.println(System.identityHashCode(arr[1]));

		System.out.println(args[0]); // this array always use new arr[], which means it creates new obj on heap to store string
		System.out.println(args[1]); // we can check this in bytecode

		System.out.println(System.identityHashCode(args[0]));
		System.out.println(System.identityHashCode(args[1]));
	}
}
