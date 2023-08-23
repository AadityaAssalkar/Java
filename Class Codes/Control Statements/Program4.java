// Practice code-4

// Given the temperature of a person in fahrenheit
// Print whether the person has high, normal, low temperature
// > 98.6		--> high
// 98.0 <= and <= 98.6	--> normal
// <98.00		--> low


class Demo{
	public static void main(String[] args){
		float temp = 98.5f;

		if(temp < 98.0f){
			System.out.println("low");
		}else if((temp >= 98.0) && (temp <= 98.6)){
			System.out.println("normal");
		}else{
			System.out.println("high");}
	}
}
