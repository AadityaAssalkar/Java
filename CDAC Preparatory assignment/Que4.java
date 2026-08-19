/*
Q4. Student Grade
Write a program to calculate the grade of a student.
The student has five subjects, and marks for each subject are entered from the keyboard. Assume that each 
subject is evaluated out of 20 marks, making the total marks out of 100.

Assign the grade according to the following rules:
Total Marks Grade
90–100 Ex
80–89 A
70–79 B
60–69 C
Below 60 F
Display the total marks and the corresponding grade.
*/

import java.util.Scanner;

class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = sc.nextInt();
            if(marks > 20){
              System.out.println("Invalid Input");
              i--;
              continue;
            }

            total = total + marks;
        }

        String grade;

        if (total >= 90) {
            grade = "Ex";
        } else if (total >= 80) {
            grade = "A";
        } else if (total >= 70) {
            grade = "B";
        } else if (total >= 60) {
            grade = "C";
        } else {
            grade = "F";
        }

        System.out.println("Total Marks: " + total);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
