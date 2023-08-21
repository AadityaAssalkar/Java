// Practice code-8

// Elictricity bill problem
// Given an integer input A which represents units of electricity consumed at your house.
// Calculate and print the bill amount as per
// units <= 100  --> price per unit is 1
// units > 100	 --> price per unit is 2
// Input: 50 ;  Output: 50
// Input: 200;  Output: 300


class Program{
	public static void main(String[] args){
		int x = 200;

		if(x <= 100){
			System.out.println(x*1);
		} else {
			System.out.println((x - 100)*2 + (100*1));
		}
	}
}
