import java.util.Scanner;

class Demo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Company Name: ");
		String name = sc.next();

		System.out.print("Enter your package: ");
		double sal = sc.nextDouble();

		System.out.println("Company: " + name);
		System.out.println("Package: " + sal);
	}
}
