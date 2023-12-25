import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter array size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int count = 0;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 == 0) {
				count++;
			}
		}
		System.out.println("Even count = " + count);
	}
}
