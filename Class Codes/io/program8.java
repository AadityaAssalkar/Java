import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
		
		String str1 = br1.readLine();
		br1.close(); // closes the connection of JVM with keyboard
		String str2 = br2.readLine(); // Exception: Stream closed
	}
}
