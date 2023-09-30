class Demo{
	public static void main(String[] args){
		int ch = 65;
		switch(ch){
			case 'A': // Every character in java is recognized by its ASCII value therefore comparison for 'A' will be like (65 == 65) as ASCII value of 'A' is 65
				System.out.println("char-A");
				break;
			case 65: // Error: duplicate case, duplicate of case 'A'
				System.out.println("num-65");
				break;
			case 'B':
				System.out.println("char-B");
				break;
			case 66: // Error duplicase case
				System.out.println("num-66");
				break;
			default:
				System.out.println("char-A");
				break;
		}
	}
}
