// Write a program to check day number(1-7) and print the corresponding day of week
// Input1: 1; Output1: Monday;
// Input2: 6; Output2: Saturday;
// Input3: 8; Output3: ????

class Demo{
	public static void main(String[] args){
		int day = 8;

		if(day == 1){
			System.out.println("Monday");
		} else if(day == 2){
			System.out.println("Tuesday");
		} else if(day == 3){
			System.out.println("Wednesday");
		} else if(day == 4){
			System.out.println("Thursday");
		} else if(day == 5){
			System.out.println("Friday");
		} else if(day == 6){
			System.out.println("Saturday");
		} else if(day == 7){
			System.out.println("Sunday");
		} else{
			System.out.println("Invalid Input");
		}
	}
}
