import java.util.*;

class Demo {
	static void add(int a, int b) {
		int ans = a + b;
		System.out.println("Sum of a and b is " + ans);
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter integer values: ");
		int a = sc.nextInt();
		int b = sc.nextInt();

		add(a, b);
	}
}
