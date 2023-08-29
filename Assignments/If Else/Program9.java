// Write a program in java to accept three numbers and check whether the are Pythogorean triplets or not
// Input1: a = 3; b = 4; c = 5;  Output1: It is a Pythogorean triplet
// Input2: a = 1; b = 6; c = 9;  Output2: It is not a Pythogorean triplet
// Input3: a = 2; b = 2; c = 2;  Output3: ????

class Demo{
	public static void main(String[] args){
		int a = 3;
		int b = 4;
		int c = 5;

		if((a*a == b*b + c*c) || (b*b == a*a + c*c) || (c*c == b*b + a*a)){
			System.out.println("It is a Pythogorean triplet");
		} else{
			System.out.println("It is not a Pythogorean triplet");
		}
	}
}
