// Home-work
// write a program that shows a real time example of nested switch statement excluding OTT and Hotels

// cars, library, ...
class Demo{
	public static void main(String[] args){
		String str = "BMW";
		
		switch(str){
			case "BMW":{
				String str1 = "SUVs";
				switch(str1){
					case "Sedans":
						System.out.println("BMW 5 series and more");
						break;
					case "SUVs":
						System.out.println("XM is the most expensive car by BMW");
						break;
					case "Convertibles":
						System.out.println("BMW M2");
						break;
					default:
						System.out.println("Invalid");
						break;
				};
			}
			break;

			case "Tata-motres":{
				String str1 = "trucks";
				switch(str1){
					case "cars":
						System.out.println("Tiago, Harrier, Safari, ...");
						break;
					case "vans":
						System.out.println("Winger, Yodha, ...");
						break;
					case "trucks":
						System.out.println("LPT, signa, prima, ...");
						break;
					default:
						System.out.println("Invalid");
						break;
				};
			}
			break;

			default:
				System.out.println("Select anything from menu");
				break;
		};
	}
}
