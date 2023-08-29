// write a program to print the following pattern
// 1   2   3   4   
// 2   3   4   5   
// 3   4   5   6   
// 4   5   6   7   
//
// USE THIS FOR LOOP STRICTLY
//
// for(int i =1; i <= 4; i++) {
//	for(int j = 1; i <= 4; j++) {
//		
//	}
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			for(int j = 1; j <= 4; j++) {
				if(i == 1)
					System.out.print(j + "   ");
				else if(i == 2)
					System.out.print(j + 1 + "   ");
				else if(i == 3)
					System.out.print(j + 2 + "   ");
				else
					System.out.print(j + 3 + "   ");
			}
			System.out.println();
		}
	}
}
