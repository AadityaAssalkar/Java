// Unary Operators(Code1)

class Demo{
	public static void main(String[] args){
		int x = 5;
		int y = 7;

		System.out.println(++x);  // this operator internally calls pre method which return the value of variable after increment (Refer notes for more info)
		System.out.println(++y);

		System.out.println(--x);
		System.out.println(--y);

		System.out.println(x);
		System.out.println(y);
	}
}
