// Write a program to count the Odd digits of the given number.
// Input: 942111423  Output: count of odd digits = 5

class Demo{
	public static void main(String[] args){
		int count = 0;

		for(int num = 942111423; num != 0; num = num/10){
			if(num%2 != 0){
				count++;
			}
		}
		System.out.println(count);
	}
}

// Dry Run:

// num          num != 0          if(num%2 != 0)     count          num = num/10
//
// 942111423	942111423 != 0	  true		     1		    94211142
// 94211142 	94211142  != 0	  false		     1		    9421114
// 9421114  	9421114   != 0	  false		     1		    942111
// 942111   	942111    != 0	  true		     2		    94211
// 94211    	94211     != 0	  true		     3		    9421
// 9421     	9421      != 0	  true		     4		    942
// 942      	942       != 0	  false		     4		    94
// 94       	94        != 0	  false		     4		    9
// 9        	9         != 0	  true		     5		    0
// 0         	0 != 0(false)
