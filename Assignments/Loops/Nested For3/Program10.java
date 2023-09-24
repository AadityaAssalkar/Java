// Write a program to print the following pattern

// 1    2    3    4    
// 4    5    6    
// 6    7    
// 7    

// USE THIS FOR LOOP STRICTLY for the outer loop
// for(int i = 1; i <= 4; i++) {
//
// }

class Demo {
	public static void main(String[] args) {
		int num = 1;
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 5 - i; j++){
				System.out.print(num++ + "    ");
			}
			num--;
			System.out.println();
		}
	}
}
