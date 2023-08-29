// write a program to print the following pattern
// C2W  C2W  C2W  
// C2W  C2W  C2W  
// C2W  C2W  C2W  

class Demo {
	public static void main(String[] args) {
		String str = "C2W";
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				System.out.print(str + "  ");
			}
			System.out.println();
		}
	}
}
