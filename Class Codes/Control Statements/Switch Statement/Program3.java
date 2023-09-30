class Demo{
	public static void main(String[] args){
		int x = 5;
		switch(x){
			case 1:
				System.out.println("1");
				break;
			case 2:
				System.out.println("2");
				break;
			case 5:
				System.out.println("first-5");
				break;
			case 5: // Error since duplicate case labels are not allowed in java
				System.out.println("second-5");
				break;
			case 2: // Error
				System.out.println("second-2");
				break;
			default:
				System.out.println("No match");
				break; // In default break is not necessary but a good practice
		};
		System.out.println("After switch");
	}
}
