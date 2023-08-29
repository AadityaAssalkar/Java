// Write a program to print the countdown of days to submit the assignment
// Input: day = 7  Output: 7 days remaining
// 			   6 days remaining
// 			   .
// 			   .
// 			   1 days remaining
// 			   0 days Assignment is Overdue

class Demo{
	public static void main(String[] args){
		for(int day = 7; day >= 0; day--){
			if(day == 0)
				System.out.println("0 days Assignment is Overdue");
			else
				System.out.println(day + " days remaining");
		}
	}
}

// Dry Run:

// day     day > 0     day == 0     if/else     i--
// 7	   true	       false	    else 	6
// 6	   true	       false	    else	5
// 5	   true	       false	    else	4
// 4	   true	       false	    else	3
// 3	   true	       false	    else	2
// 2	   true	       false	    else	1
// 1	   true	       true	    if  	0
// 0	   false(end)
