// Java allot memory at runtime

class Demo {
	public static void main(String[] args) {
		int arr1[] = {10, 20, 30, 40, 50};
		char arr2[] = {'A', 'B', 'C'};
		float arr3[] = {10.5f, 20.5f};
		boolean arr4[] = {true, false, true};

		System.out.println("Integer array");
		System.out.println(arr1[0]);
		System.out.println(arr1[1]);
		System.out.println(arr1[2]);
		System.out.println(arr1[3]);
		System.out.println(arr1[4]);
		System.out.println("Character array");
		System.out.println(arr2[0]);
		System.out.println(arr2[1]);
		System.out.println(arr2[2]);
		System.out.println("Float array");
		System.out.println(arr3[0]);
		System.out.println(arr3[1]);
		System.out.println(arr3[2]); // ArrayIndexOutOfBoundsException
		System.out.println("boolean array");
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
	}
}
