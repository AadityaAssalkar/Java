// Write a program which take's number from user if number is even print that number in reverse order or if number is odd print that number in reverse order by difference two?
// Input: 6  Output: 6 5 4 3 2 1
// Input: 7  Output: 7 5 3 1

class Demo{
	public static void main(String[] args){
		int i = 6;

		if(i%2 == 0) {
			for(; i > 0; i--) {
				System.out.print(i + " ");
			}
		} else {
			for(; i > 0; i--) {
				if(i%2 == 1) {
					System.out.print(i + " ");
				}
			}
		}
	}
}

// Dry Run:

// if(true)     i >= 1     Sop     i--
// 		6 >= 1	   6	   5
// 		5 >= 1	   5	   4
// 		4 >= 1	   4	   3
// 		3 >= 1	   3	   2
// 		2 >= 1	   2	   1
// 		1 >= 1	   1	   0
// 		0 >= 1(false) END
//
// if(false)    i >= 1     i%2 != 0     Sop     i--
// 		7 >= 1	   true		7	6
// 		6 >= 1	   false		5
// 		5 >= 1	   true		5	4
// 		4 >= 1	   false		3
// 		3 >= 1	   true		3	2
// 		2 >= 1	   false		1
// 		1 >= 1	   true		1	0
// 		0 >= 1(false) END
