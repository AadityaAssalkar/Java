// write a program to print the following pattern

// A    B    C    D    
// B    C    D
// C    D    
// D    

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row = 4;
// for(int i = 1; i <= row; i++){
//
// }

class Demo{
	public static void main(String[] args){
		int row = 4;
		for(int i = 1; i <= row; i++){
			int num = 64;
			num = num + i;
			for(int j = 1; j <= row - i + 1; j++){
				System.out.print((char)num++ + "    ");
			}
			System.out.println();
		}
	}
}
