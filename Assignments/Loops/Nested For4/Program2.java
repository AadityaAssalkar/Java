// write a program to print the following pattern

// 1    
// 3    4    
// 6    7    8    
// 10   11   12   13
// 15   16   17   18   19

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row = 5;
// for(int i = 1; i <= row; i++){
//
// }

class Demo{
	public static void main(String[] args){
		int row = 5;
		int start = 0;
		for(int i = 1; i <= row; i++){
			int num = i + start;
			for(int j = 1; j <= i; j++){
				if(num < 10){
					if(j == 1){
						start = num;
					}
					System.out.print(num + "    ");
				} else{
					if(j == 1){
						start = num;
					}
					System.out.print(num + "   ");
				}
				num++;
			}
			System.out.println();
		}
	}
}
