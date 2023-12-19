import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Society Name: ");
		String name = br.readLine();

		System.out.print("Enter Wing: ");
		char wing = (char)br.read(); // read() method returns integer value and excludes \n that we need to handle as below otherwise it gives -> error: Number format exception
		br.skip(1);

		System.out.print("Enter Flat no.: ");
		int flat = Integer.parseInt(br.readLine());

		System.out.println("");
		System.out.println("Home address: ");
		System.out.println("Society Name: " + name);
		System.out.println("Wing: " + wing);
		System.out.println("Flat no.: " + flat);
	}
}
