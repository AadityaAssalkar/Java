// Take choice from user
// Show this to user

// What's your interest?
// 1. Movies
// 2. Series
// Enter you choice 1 or 2:

// If user enters 1:

// Movie you wish to watch today
// 1. Founder
// 2. Snowden
// 3. Jobs
// 4. Her
// 5. Social Network
// 6. Wall-E
// 7. AI

// If user enters 2:

// Best series to watch
// 1. Silicon valley
// 2. Devs
// 3. the IT crowd
// 4. Mr Robot

// Print users choice


import java.io.*;

class Demo {
	public static void main(String[] args) throws IOException{
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("What's your Interest?\n1. Movies\n2. Series\n\nEnter your choice 1 or 2: ");
		int choice1 = Integer.parseInt(r.readLine());

		switch(choice1) {
			case 1: System.out.print("Movies you wish to watch today:\n1. Founder\n2. Snowden\n3. Jobs\n4. Her\n5. Social Network\n6.Wall-E\n7. AI\n\nEnter a choice: ");
				int choice2 = Integer.parseInt(r.readLine());
				switch(choice2) {
					case 1: System.out.println("Founder"); break;
					case 2: System.out.println("Snowden"); break;
					case 3: System.out.println("Jobs"); break;
					case 4: System.out.println("Her"); break;
					case 5: System.out.println("Social Network"); break;
					case 6: System.out.println("Wall-E"); break;
					case 7: System.out.println("AI"); break;
					default: System.out.println("Invalid Choice"); break;
				}
			break;
			case 2: System.out.print("Best series to watch:\n1. Silicon valley\n2. Devs\n3. the IT crowd\n4. Mr Robot\n\nEnter a choice: "); 
				int choice3 = Integer.parseInt(r.readLine());
				switch(choice3) {
					case 1: System.out.println("Silicon valley"); break;
					case 2: System.out.println("Devs"); break;
					case 3: System.out.println("the IT crowd"); break;
					case 4: System.out.println("Mr Robot"); break;
					default: System.out.println("Invalid Choice"); break;
				}
			break;
			default: System.out.print("Invalid Choice");
			break;
		}
	}
}
