// while typecasting anything to char, compiler gives error if we are typecasting from string, but in case of any other datatype it does not give error neither by compiler nor by jvm but also does not print anything if we do sop on char variable

class Demo{
	public static void main(String[] args) {
		String a = "2";
		char c = (char)a;
		System.out.println(c);
	}
}
