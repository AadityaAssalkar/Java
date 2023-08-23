// Arithmatic Operators
// which is nothing but simple mathematics

class Demo{
	public static void main(String[] args){
		int x = 10;
		int y = 20;

		System.out.println(x+y);
		System.out.println(x-y);
		System.out.println(x*y);
		System.out.println(x/y);
		System.out.println(x%y);  // Floor division (returns reminder)
		
		int z = 30;
		int ans = x + y * z + (x - y);
		System.out.println(ans);
	}
}
