// write a program to print the following pattern
// 12  12  12  
// 11  11  11  
// 10  10  10  

class Demo {
	public static void main(String[] args) {
		for(int i = 3; i >= 1; i--) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(i + 9 + "  ");
			}
			System.out.println();
		}
	}
}
