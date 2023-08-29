// Write a unique real-time example of If ElseIf Else Ladder

class Demo{
	public static void main(String[] args){
		int temp = 30;

		if((temp > 25) && (temp <= 30)){
			System.out.println("Switch on Fan");
		} else if((temp > 30) && (temp <= 40)){
			System.out.println("Switch on AC");
		} else if(temp > 40){
			System.out.println("Use both Fan and AC");
		} else{
			System.out.println("Use Winter Cloths");
		}
	}
}
