// Logical Operator
// Operates only on boolean values

class Program{
	public static void main(String[] args){
		int x = 5;
		int y = 7;

		int ans = x && y;  // Error: cause x and y are of type 'int' not 'bool'
		System.out.println(ans);
	}
}
