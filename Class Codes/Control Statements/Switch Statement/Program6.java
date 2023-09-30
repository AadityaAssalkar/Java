// This was not allowed till version 1.6 but from 1.7 'enum' and 'String' classes are added for switch statement

class Demo{
	public  static void main(String[] args){
		String str = "Mon";

		switch(str){
			case "Mon":
				System.out.println("Monday");
				break;
			case "Tue":
				System.out.println("Tuesday");
			default:
				System.out.println("It's Sunday");
				break;
		}
	}
}
