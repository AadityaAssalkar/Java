// Write a program to print the following pattern

// 3C   3C   3C   3C   
// 3C   3C   3C   
// 3C   3C   
// 3C   

// USE THIS FOR LOOP STRICTLY for the outer loop
// for(int i = 1; i <= 4; i++) {
//
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 5 - i; j++) {
				System.out.print("3C   ");
			}
			System.out.println();
		}
	}
}
