// Write a program to print the following pattern

// 10   10   10   10   
// 11   11   11   
// 12   12   
// 13   

// USE THIS FOR LOOP STRICTLY for the outer loop
// for(int i = 1; i <= 4; i++){
//
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 5 - i; j++){
				System.out.print(i + 9 + "   ");
			}
			System.out.println();
		}
	}
}
