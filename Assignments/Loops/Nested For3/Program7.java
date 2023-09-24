// Write a program to print the following pattern

// F    
// E    F    
// D    E    F    
// C    D    E    F    
// B    C    D    E    F    
// A    B    C    D    E    F    

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row = 6;
// for(int i = 1; i <= row; i++) {
//
// }

class Demo {
	public static void main(String[] args) {
		int row = 6;
		for(int i = 1; i <= row; i++){
			int num = 71 - i;
			for(int j = 1; j <= i; j++){
				System.out.print((char)num++ + "    ");
			}
			System.out.println();
		}
	}
}
