// Example of Nested switch

class Demo{
	public static void main(String[] args){
		String str = "veg";
		
		switch(str){
			case "veg":{
				String str1 = "Starter";
				switch(str1){
					case "Starter":
						System.out.println("Masala Papad");
						break;
					case "Main course":
						System.out.println("Paneer Butter Masala");
						break;
					case "Dessert":
						System.out.println("Ice-cream");
						break;
					default:
						System.out.println("Invalid");
						break;
				};
			}
			break;

			case "Non-veg":{
				String str1 = "Dessert";
				switch(str1){
					case "Starter":
						System.out.println("Sticks");
						break;
					case "Main course":
						System.out.println("Biryani");
						break;
					case "Dessert":
						System.out.println("Muffins");
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
