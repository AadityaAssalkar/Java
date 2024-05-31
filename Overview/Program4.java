// In case of smaller datatypes short and byte java consider value generated at runtime as int therefore following code gives error

class Demo {
	public static void main(String[] args){
		byte var1 = 18;
		byte var2 = 18;
		byte var3 = var1 + var2;
		System.out.println(var3);
	}
}
