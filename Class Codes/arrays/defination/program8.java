import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int arr[] = new int[5];
		int arrSum = 0;

		for(int i = 0; i < 5; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			arrSum = arrSum + arr[i];
		}
		System.out.println("Sum of array elements is " + arrSum);
	}
}
