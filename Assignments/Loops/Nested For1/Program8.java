// write a program to print the following pattern
// d   d   d   d   
// c   c   c   c   
// b   b   b   b   
// a   a   a   a   

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == 1)
					System.out.print("d   ");
				else if(i == 2)
					System.out.print("c   ");
				else if(i == 3)
					System.out.print("b   ");
				else
					System.out.print("a   ");
			}
			System.out.println();
		}
	}
}
