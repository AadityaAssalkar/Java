// Write a program to print the square of even digits of the given number.
// Input: 942111423  Output: 4 16 4 16

class Demo{
	public static void main(String[] args){
		int num = 942111423;
		int temp;

		while(num != 0){
			temp = num%10;
			if(temp%2 == 0){
				System.out.println(temp*temp);
			}
			num = num/10;
		}
	}
}

// Dry Run:

// num           num != 0          temp     temp%2 == 0     print     num = num/10
//
// 942111423  	 true    	   3	    false	       	      94211142
// 94211142   	 true 		   2	    true	    4  	      9421114
// 9421114   	 true 		   4	    true	    16 	      942111
// 942111   	 true 		   1	    false	       	      94211
// 94211   	 true 		   1	    false	       	      9421
// 9421   	 true		   1	    false	       	      942
// 942   	 true		   2	    true	    4 	      94
// 94   	 true		   4	    true	    16 	      9
// 9    	 true		   9	    false	       	      0
// 0    	 false
