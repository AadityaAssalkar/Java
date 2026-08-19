// Q2. Factorial of a Number
// Write a program to calculate the factorial of a given non-negative integer.

class Factorial{
  public static void main(String[] args){
    int num = 5;
    int fact = 1;

    for(int i = num; i > 0; i--){
      fact = fact * i;
    }

    System.out.println(fact);
  }
}
