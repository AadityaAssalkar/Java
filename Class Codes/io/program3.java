import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		InputStreamReader is = new InputStreamReader(System.in);

		System.out.println("Enter char: ");
		int ch1 = isr.read();

		System.out.println("Enter next char: ");
		char ch2 = (char)is.read();

		System.out.println(ch1);
		System.out.println(ch2);
	}
}
