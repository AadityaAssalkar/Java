// write a program to print the following pattern
// C   B   A   
// C   B   A   
// C   B   A   

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) {
			for(int j = 1; j <= 3; j++) {
				if(j == 1)
					System.out.print("C   ");
				else if(j == 2)
					System.out.print("B   ");
				else
					System.out.print("A   ");
			}
			System.out.println();
		}
	}
}
