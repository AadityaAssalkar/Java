// Write a program to print a table of 2

class Demo{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++){
			System.out.println(i*2);
		}
	}
}

// Dry Run:

// i     i <= 10     body(i*2)     incremented_value(i++)

// 1     1 <= 10     2              2
// 2     1 <= 10     4              3
// 3     1 <= 10     6              4
// 4     1 <= 10     8              5
// 5     1 <= 10     10             6
// 6     1 <= 10     12             7
// 7     1 <= 10     14             8
// 8     1 <= 10     16             9
// 9     1 <= 10     18             10
// 10    10 <= 10    20             11
// 11    11 <= 10(false)
