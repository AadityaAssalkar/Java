// Nested switch - 1

class Demo {
	public static void main(String[] args) {
		String str = "Movies";

		switch(str) {
			case "Movies": {
				String str1 = "crime";
				switch(str1) {
					case "sci-fi": System.out.println("scifi movies"); break;
					case "crime" : System.out.println("crime thriller movies"); break;
					case "drama" : System.out.println("drama shows"); break;
					default: System.out.println("Not a catagory ❌"); break;
				};
			} break;
			
			case "Series": {
				String str1 = "crime";
				switch(str1) {
					case "sci-fi": System.out.println("scifi movies"); break;
					case "crime" : System.out.println("crime thriller movies"); break;
					case "drama" : System.out.println("drama shows"); break;
					default: System.out.println("Not a catagory ❌"); break;
				};
			} break;

			case "Anime": {
				String str1 = "crime";
				switch(str1) {
					case "sci-fi": System.out.println("scifi movies"); break;
					case "crime" : System.out.println("crime thriller movies"); break;
					case "drama" : System.out.println("drama shows"); break;
					default: System.out.println("Not a catagory ❌"); break;
				};
			} break;

		};
	}
}
