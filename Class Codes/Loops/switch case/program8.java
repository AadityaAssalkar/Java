// Nested switch - 2

class Demo {
	public static void main(String[] args) {
		String str = "Veg";

		switch(str) {
			case "Veg": {
				String str1 = "starter";
				switch(str1) {
					case "starter": System.out.println("Masala Papad"); break;
					case "main corse" : System.out.println("Paneer Butter Masala"); break;
					case "dessert" : System.out.println("Ice-cream"); break;
					default: System.out.println("Not a catagory ❌"); break;
				};
			} break;
			
			case "Non-Veg": {
				String str1 = "dessert";
				switch(str1) {
					case "starter": System.out.println("Soup"); break;
					case "main corse" : System.out.println("Biryani"); break;
					case "dessert" : System.out.println("Muffins"); break;
					default: System.out.println("Not a catagory ❌"); break;
				};
			} break;

		};
	}
}
