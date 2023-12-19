import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Player name: ");
		String name = br.readLine();

		System.out.print("Jersy number: ");
		int jerNo = Integer.parseInt(br.readLine());

		System.out.print("Average: ");
		float avg = Float.parseFloat(br.readLine());

		System.out.println("");
		System.out.println("Player info: ");
		System.out.println("Name: " + name);
		System.out.println("Jersy no.: " + jerNo);
		System.out.println("Average: " + avg);
	}
}
