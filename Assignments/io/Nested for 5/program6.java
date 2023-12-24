// Write a program, and take two characters if these characters are equal then print them as it is but if they are unequal then print their difference.
// {Note: Consider Positional Difference Not ASCIIs}
// Input: a p
// Output: The difference between a and p is 15

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter first character: ");
		char a = (char)br.read();
		br.skip(1);

		System.out.print("Enter second character: ");
		char b = (char)br.read();
		br.skip(1);

		if(a == b){
			System.out.println(a);
		} else {
			if(a > b) {
				System.out.println("The difference between " + (char)a + " and " + (char)b + " is " + (a-b));
			} else {
				System.out.println("The difference between " + (char)a + " and " + (char)b + " is " + (b-a));
			}
		}
		/*if(a > 96  && a < 123) {
			for(int i = 1; i < 33; i++) {
				a--;
			}
		}

		System.out.print("Enter second character: ");
		char b = (char)br.read();
		br.skip(1);

		if(b > 96  && b < 123) {
			for(int i = 1; i < 33; i++) {
				b--;
			}
		}

		if(a == b) {
			System.out.println((char)a);
		} else {
			if(a > b)
				System.out.println("The difference between " + (char)a + " and " + (char)b + " is " + (b-a));
			else
				System.out.println("The difference between " + (char)a + " and " + (char)b + " is " + (b-a));
		}*/
	}
}
