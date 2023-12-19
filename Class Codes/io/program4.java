import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);

		System.out.print("Enter name: ");
		String name = br.readLine(); // Reads whole string

		System.out.print("Enter age: ");
		int age = Integer.parseInt(br.readLine());

		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}
