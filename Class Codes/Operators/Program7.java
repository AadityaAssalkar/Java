// Bitwise Operator
// performs logical operation on binary number of that value and returns calculated value in original type
// refer notes for more info

class Program{
	public static void main(String[] args){
		int x = 8;
		int y = 10;
		int z = -7;

		System.out.println(x & y);
		System.out.println(x | y);
		System.out.println(x ^ y);
		System.out.println(x << 2);
		System.out.println(x >> 2);
		System.out.println(y >>> 2);
		System.out.println(z >>> 2);
	}
}
