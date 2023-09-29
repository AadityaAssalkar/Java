// write a program to print the following pattern

//     1
//     8     9
//     27    16    125
//     64    25    216   49

// USE THIS FOR LOOP STRICTLY for the outer loop
// int row = 4;
// for(int i = 1; i <= row; i++){
//
// }

class Demo{
	public static void main(String[] args){
		int row = 4;
		for(int i = 1; i <= row; i++){
			int num = 0;
			num = num + i;
			for(int j = 1; j <= i; j++){
				if(j%2 == 1){
					if(num == 2)
						System.out.print("    " + num*num*num + " ");
					else
						System.out.print("    " + num*num*num);
				} else{
					if(num == 7)
						System.out.print("   " + num*num);
					else
						System.out.print("    " + num*num);
				}
				num++;
			}
			System.out.println();
		}
	}
}
