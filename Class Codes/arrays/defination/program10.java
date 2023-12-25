import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter array size: ");
		int size = Integer.parseInt(br.readLine());

		int arr[] = new int[size];
		int evenCount = 0;
		int oddCount = 0;

		for(int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]%2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		System.out.println("Even count = " + evenCount);
		System.out.println("Odd count = " + oddCount);
	}
}
