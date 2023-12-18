// Write a program in which students should enter marks of 5 different subjects. If all subject having above passing marks add them and provide to switch case to print grades(first class, second class), if student get fail in any subject program should print "You failed in exam"

import java.io.*;
import java.util.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		
		int English;
		System.out.print("Enter English marks = ");
		English = Integer.parseInt(r.readLine());

		int Marathi;
		System.out.print("Enter Marathi marks = ");
		Marathi = Integer.parseInt(r.readLine());

		int Maths;
		System.out.print("Enter Maths marks = ");
		Maths = Integer.parseInt(r.readLine());

		int Science;
		System.out.print("Enter Science marks = ");
		Science = Integer.parseInt(r.readLine());

		int History;
		System.out.print("Enter History marks = ");
		History = Integer.parseInt(r.readLine());

		if(English<35 || Marathi<35 || Maths<35 || Science<35 || History<35) {
			System.out.println("You failed Exam");
		} else {
			double avg = (English+Marathi+Maths+Science+History)/5;
		
			char grade;
			if(avg >= 80) {
				grade = 'A';
			} else if(avg >= 65 && avg < 80) {
				grade = 'B';
			} else if(avg >= 55 && avg < 65) {
				grade = 'C';
			} else if(avg >= 45 && avg < 55) {
				grade = 'D';
			} else if(avg >= 35 && avg < 45) {
				grade = 'P';
			} else {
				grade = 'F';
			}

			switch(grade) {
				case 'A': System.out.println("First class with Distinction"); break;
				case 'B': System.out.println("First class"); break;
				case 'C': System.out.println("Second class"); break;
				case 'D': System.out.println("Third class"); break;
				case 'P': System.out.println("Pass"); break;
				case 'F': System.out.println("Fail"); break;
				default: System.out.println("Result pending"); break;
			}
		}
	}
}
