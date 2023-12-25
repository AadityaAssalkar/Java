class Demo {
	static void fun(int xarr[]) {
		for(int x: xarr) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10, 20, 30};
		for(int x: arr) {
			System.out.println(x);
		}
		fun(arr); // passing the reference(of address) of arr means passing the whole array
	}
}
