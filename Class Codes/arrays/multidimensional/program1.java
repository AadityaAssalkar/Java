// Array on JVM
// integers in range of -128 to 127 are stored on integer cache and array use this referances while handeling integer values

class Array{
	void fun(int[] arr) {
		arr[1] = 70;
		arr[2] = 80;
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30, 40};

		System.out.println(System.identityHashCode(arr[0])); // identityHashCode belongs to data/elements its not an address
		System.out.println(System.identityHashCode(arr[1]));
		System.out.println(System.identityHashCode(arr[2]));
		System.out.println(System.identityHashCode(arr[3]));

		Array obj = new Array();
		obj.fun(arr);
		
		for(int x : arr) {
			System.out.println(x);
		}
	}
}
