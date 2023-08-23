// Calculate profit or loss.
// Write a program that takes the cost price and selling price (take it hardcoded) and calculates its profit or loss
// Input1: sellingPrice = 1200; costPrice = 1000;  Output1: Profit of 200
// Input2: sellingPrice = 300;  costPrice = 500;   Output2: Profit of 200
// Input3: sellingPrice = 900;  costPrice = 900;   Output3: ????

class Demo{
	public static void main(String[] args){
		int sellingPrice = 900;
		int costPrice = 900;

		if(sellingPrice > costPrice){
			System.out.println("Profit of " + (sellingPrice - costPrice));
		} else if(sellingPrice < costPrice){
			System.out.println("Loss of " + (costPrice - sellingPrice));
		} else{
			System.out.println("No Profit Or Loss");
		}
	}
}
