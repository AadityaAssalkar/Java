// Q1. Find the Maximum Number
// Accept n numbers through command-line arguments and find and display the maximum number.
// Note: Assume that at least one number is provided.

import java.util.*;

class MaxNum{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("How many numbers do you want to compare?");
    int n = sc.nextInt();
    int max = Integer.MIN_VALUE;

    for(int i = 0, i < n, i++){
      int num = sc.nextInt();
      if(num > max){
        max = num;
      }
    }

    System.out.println("Maximum Number: " + max);
  }
}
