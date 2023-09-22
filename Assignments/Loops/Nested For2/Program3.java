// Write a program to print the following pattern

// 14    15    16    17    
// 15    16    17    18    
// 16    17    18    19    
// 17    18    19    20    

// USE THIS FOR LOOP STRICTLY
// for(int i = 1; i <= 4; i++) {
//	for(int j = 1; j <= 4; j++) {
//
//	}
// }

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 4; i++) {
			int num = 12 + i;
			for(int j = 1; j <= 4; j++) {
				System.out.print(j + num + "    ");
			}
			System.out.println();
		}
	}
}


// Dry Run:
 
// i     i <= 4     num     j     j <= 4     sop     j++     sop     i++
// 1	 1 <= 4✅   13	    1	  1 <= 4✅   14	     2
//			    2	  2 <= 4✅   15	     3 
//			    3	  3 <= 4✅   16	     4 
//			    4	  4 <= 4✅   17	     5 
//			    5	  5 <= 4❌ 		     \n      2
// 2	 2 <= 4✅   14	    1	  1 <= 4✅   15	     2
//			    2	  2 <= 4✅   16	     3 
//			    3	  3 <= 4✅   17	     4 
//			    4	  4 <= 4✅   18	     5 
//			    5	  5 <= 4❌ 		     \n      3
// 3	 3 <= 4✅   15	    1	  1 <= 4✅   16	     2
//			    2	  2 <= 4✅   17	     3 
//			    3	  3 <= 4✅   18	     4 
//			    4	  4 <= 4✅   19	     5 
//			    5	  5 <= 4❌ 		     \n      4
// 4	 4 <= 4✅   16	    1	  1 <= 4✅   17	     2
//			    2	  2 <= 4✅   18	     3 
//			    3	  3 <= 4✅   19	     4 
//			    4	  4 <= 4✅   20	     5 
//			    5	  5 <= 4❌ 		     \n      5
// 5	 5 <= 4❌ 
