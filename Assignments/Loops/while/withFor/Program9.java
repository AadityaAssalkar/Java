// Write a program to reverse the given number.
// Input: 942111423  Output: 324111249

class Demo{
	public static void main(String[] args){
		for(int i = 942111423; i != 0; i = i/10){
			System.out.print(i%10);
		}
	}
}

// Dry Run:

// i          i != 0     Sop     i = i/10
// 942111423  true	 3	 94211142
// 94211142   true	 2	 9421114
// 9421114    true	 4	 942111
// 942111     true	 1	 94211
// 94211      true	 1	 9421
// 9421       true	 1	 942
// 942        true	 2	 94
// 94         true	 4	 9
// 9          true	 9	 0
// 0          false(end)
