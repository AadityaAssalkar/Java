// Q1. Find the Maximum Number
// Accept n numbers through command-line arguments and find and display the maximum number.
// Note: Assume that at least one number is provided.

class MaxNum{
  public static void main(String[] args){
    int max = Integer.parseInt(args[0]);

        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);

            if (num > max) {
                max = num;
            }
        }

        System.out.println("Maximum number: " + max);
  }
}
