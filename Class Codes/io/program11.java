import java.util.*;
import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter result data: ");
		String data = br.readLine();
		System.out.println("Date: " + data);

		StringTokenizer st = new StringTokenizer(data, " ");
		String name = st.nextToken();
		char grade = st.nextToken().charAt(0);
		int marks = Integer.parseInt(st.nextToken());
		float percentage = Float.parseFloat(st.nextToken());

		System.out.println("Enter Result: ");
		System.out.println("Student name: " + name);
		System.out.println("Grade: " + grade);
		System.out.println("Marks: " + marks);
		System.out.println("Percentage: " + percentage);
	}
}
