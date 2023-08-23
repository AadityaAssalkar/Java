// Demonstration of while loop

class Demo{
	public static void main(String[] args){
		int i = 1;

		while (i <= 10){
			System.out.println(i++);
		}
	}
}


// Dry Run:

// inatilize  -->  int i = 1;
// i     condition(i <= 10)     body     increment/decrement
// 1     1 <= 10(true)          1        2
// 2     2 <= 10(true)          2        3
// 3     3 <= 10(true)          3        4
// 4     4 <= 10(true)          4        5
// 5     5 <= 10(true)          5        6
// 6     6 <= 10(true)          6        7
// 7     7 <= 10(true)          7        8
// 8     8 <= 10(true)          8        9
// 9     9 <= 10(true)          9        10
// 10    10 <= 10(true)         10       11
// 11    11 <= 10(false)
// once the condition becomes false loop terminates
