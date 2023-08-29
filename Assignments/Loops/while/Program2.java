// Write a program to calculate the factorial of the given number.
// Input: 6  Output: factorial 6 is 720

class Demo{
	public static void main(String[] args){
		int num = 6;
		int copy = num;
		int fact = 1;

		while(copy != 0){
			fact = fact*copy;
			copy--;
		}
		System.out.println("factorial " + num + " is " + fact);
	}
}

// Dry Run:

// copy    copy != 0    fact = fact*copy    copy--
//
// 6	   6 != 0	6	  	    5
// 5	   5 != 0	30	 	    4
// 4	   4 != 0	120	 	    3
// 3	   3 != 0	360	 	    2
// 2	   2 != 0	720	 	    1
// 1	   1 != 0	720	 	    0
// 0	   0 != 0(false)
