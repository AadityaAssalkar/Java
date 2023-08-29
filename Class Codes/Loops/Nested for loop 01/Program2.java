// 5 5 5 
// 5 5 5 
// 5 5 5 

class Demo {
	public static void main(String[] args) {
		for(int i = 1; i <= 3; i++) { // outer for loop works on row
			for(int j = 1; j <= 3; j++) { // inner for loop works on column
				System.out.print("5" + " ");
			}
			System.out.println();
		}
	}
}
