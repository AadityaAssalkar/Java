// write a program to print the following pattern

// F    
// E    1    
// D    2    E
// C    3    D    4    
// B    5    C    6    D    
// A    7    B    8    C    9    

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row = 6;
// for(int i = 1; i <= row; i++){
//
// }

class Demo{
	public static void main(String[] args){
		int row = 6;
		int num = 1;
		for(int i = 1; i <= row; i++){
			int ch = 71;
			ch = ch - i;
			for(int j = 1; j <= i; j++){
				if(j%2 == 1){
					System.out.print((char)ch++ + "    ");
				} else{
					System.out.print(num++ + "    ");
				}
			}
			System.out.println();
		}
	}
}
