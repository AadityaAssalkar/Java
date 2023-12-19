import java.io.*;
import java.util.*; // for StringTokenizer

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter Match Info: ");
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");
		
		String token1 = st.nextToken();
		String token2 = st.nextToken();
		String token3 = st.nextToken();

		System.out.println("Team: " + token1);
		System.out.println("Player: " + token2);
		System.out.println("Runs: " + token3);
	}
}
