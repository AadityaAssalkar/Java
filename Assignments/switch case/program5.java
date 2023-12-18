// Write a real time example which shows a index like previous code

import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Welcome to COLD-STEAM CAFE");
		System.out.print("What would you like to have?\n1. Hot drinks\n2. Cold drinks\n\nEnter your choice: ");
		int choice1 = Integer.parseInt(r.readLine());
		
		switch(choice1) {
			case 1: System.out.print("We serve following hot drinks:\n1. Coffee\n2. Latte\n3. Hot Chocolate\n4. Masala Chai\n5. Milk\n\nEnter your selection: ");
				int choice2 = Integer.parseInt(r.readLine());
				System.out.print("You have selected: ");
				switch(choice2) {
					case 1:System.out.println("Coffee"); break;
					case 2:System.out.println("Latte"); break;
					case 3:System.out.println("Hot Chocolate"); break;
					case 4:System.out.println("Masala Chai"); break;
					case 5:System.out.println("Milk"); break;
					default:System.out.println("Invalid Selection"); break;
				}
			break;
			case 2: System.out.print("We serve following cold drinks:\n1. Cola\n2. Fizz\n3. Lemonade\n4. Cold coffee\n5. Soda\n\nEnter your selection: ");
				int choice3 = Integer.parseInt(r.readLine());
				System.out.print("You have selected: ");
				switch(choice3) {
					case 1:System.out.println("Cola"); break;
					case 2:System.out.println("Fizz"); break;
					case 3:System.out.println("Lemonade"); break;
					case 4:System.out.println("Cold coffee"); break;
					case 5:System.out.println("Soda"); break;
					default:System.out.println("Invalid Selection"); break;
				}
			break;
			default: System.out.println("Invalid Choice"); break;
		}
	}
}
