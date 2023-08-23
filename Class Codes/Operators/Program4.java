// Unary Operator(code2)

class Demo{
	public static void main(String[] args){
		int x = 5;
		int y = 7;

		System.out.println(x++);  // this operator internally calls post method (refer notes for more info)
		System.out.println(y++);

		System.out.println(x);
		System.out.println(y);
	}
}
