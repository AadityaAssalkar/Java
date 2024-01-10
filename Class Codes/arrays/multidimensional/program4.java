// ways to write 2D - array

class Array {
	public static void main(String[] args) {
		int arr[][] = new int[2][2];
		// int arr[][] = new int[3][]; ✅ valid
		// int arr[][] = new int[][3];❌ invalid

		int arr2[] = new int[2];

		System.out.println(arr.length); // returns the count of rows in the array therefore it is necessary to give the size of row not columes while defining array
		System.out.println(arr2.length);
	}
}
