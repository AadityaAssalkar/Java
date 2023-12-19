import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter Batsman Name: ");
		String batsman = br.readLine();

		System.out.print("Enter Bowler Name: ");
		String bowler = br.readLine();

		System.out.println("Batsman Name: " + batsman);
		System.out.println("Bowler Name: " + bowler);
	}
}
