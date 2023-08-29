// write a program to print the following pattern
// 1A  1A  1A  
// 1A  1A  1A  
// 1A  1A  1A  

class Demo {
	public static void main(String[] args) {
		String str = "1A";

		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(str + "  ");
			}
			System.out.println();
		}
	}
}
