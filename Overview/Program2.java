// DataTypes
// Java does memory management by itself so we cannot say that a specific datatype uses the specific amount of space
// the similar types of data can be directly typecasted from lower size to higher according to following
// double  - 8 byte
// long	   - 8 byte
// int	   - 4 byte
// float   - 4 byte
// char    - 2 byte
// short   - 2 byte
// byte    - 1 byte
// boolean - 1 byte
// If we are using datatype using wrapper class then they cannot be typecasted as above

class Demo {
	public static void main(String[] args){
		int i = 1;
		double d = 2.4;
		float f = 3.5f; // if we do not specify f after the value then it is considered as double value by default
		long l = 34344434343434987654l;
		short s = 89;
		boolean b = true;
		byte by = 8;
		char c = 'C';
		// var a = 30; // this datatype is introduced from java version 10 it can hold any datatype but once assigned that datatype cannot be change;
		System.out.println(i);
		System.out.println(d);
		System.out.println(f);
		System.out.println(l);
		System.out.println(s);
		System.out.println(b);
		System.out.println(by);
		System.out.println(c);
		// System.out.println(a);
	}
}

