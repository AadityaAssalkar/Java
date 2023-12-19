import java.util.*;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Player info: ");
		String str = sc.nextLine();

		StringTokenizer st = new StringTokenizer(str, " ");
		System.out.println("Number of tokens: " + st.countTokens());

		System.out.println("Token list: ");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
