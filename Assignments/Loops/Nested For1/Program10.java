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
			int num = i;

			for(int j = 1; j <= 4; j++) {
				System.out.print(num++ + "   ");
			}
			System.out.println();
		}
	}
}


// Dry Run:

// i     i <= 4     num = i     j     j <= 4     soprint     num++     j++     sop     i++
// 1	 1 <= 4	    1		1     1 <= 4     1	     2	       2
// 		    		2     2 <= 4     2	     3	       3
// 		    		3     3 <= 4     3	     4	       4
// 		    		4     4 <= 4     4	     5	       5
// 		    		5     5 <= 4			       	       true    2
// 2	 2 <= 4     2		1     1 <= 4	 2	     3	       2
// 				2     2 <= 4     3	     4	       3
// 				3     3 <= 4     4	     5	       4
// 				4     4 <= 4     5	     6	       5
// 				5     5 <= 4			       	       true    3
// 3	 3 <= 4     3		1     1 <= 4	 3	     4	       2
// 				2     2 <= 4     4	     5	       3
// 				3     3 <= 4     5	     6	       4
// 				4     4 <= 4     6	     7	       5
// 				5     5 <= 4				       true    4
// 4	 4 <= 4     4		1     1 <= 4	 4	     5	       2
// 				2     2 <= 4     5	     6	       3
// 				3     3 <= 4     6	     7	       4
// 				4     4 <= 4     7	     8	       5
// 				5     5 <= 4				       true    5
// 5	 5 <= 4(false)  End
