// Null pointer Exception

class Array {
	public static void main(String[] args) {
		int arr1[][] = {{}, {}, {}};
		int arr2[][] = new int[2][];

		System.out.println(arr1.length); // 3 (can count rows)
		System.out.println(arr1[0].length); // 0 (default value in empty array)

		System.out.println(arr2.length); // 2 (given length)
		System.out.println(arr2[0].length); // NullPointerException (since nothing defined about jacked array)

		// this is because initializer list defines everything
	}
}
