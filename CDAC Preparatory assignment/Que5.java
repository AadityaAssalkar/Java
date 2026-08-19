/* Q5. Character Classification
Accept a string from the user and count/display the number of:
 Uppercase letters
 Lowercase letters
 Digits
 Other characters
Display an appropriate message for each category. */

import java.util.Scanner;

class CharacterClassification {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a string: ");
    String str = sc.nextLine();

    int uppercase = 0;
    int lowercase = 0;
    int digits = 0;
    int others = 0;

    for (int i = 0; i < str.length(); i++) {

        char ch = str.charAt(i);

        if (ch >= 'A' && ch <= 'Z') {
            uppercase++;
        } else if (ch >= 'a' && ch <= 'z') {
            lowercase++;
        } else if (ch >= '0' && ch <= '9') {
            digits++;
        } else {
            others++;
        }
    }

    System.out.println("Uppercase letters: " + uppercase);
    System.out.println("Lowercase letters: " + lowercase);
    System.out.println("Digits: " + digits);
    System.out.println("Other characters: " + others);

    sc.close();
  }
}
