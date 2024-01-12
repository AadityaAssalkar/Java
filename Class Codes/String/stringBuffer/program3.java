// capicity of StringBuffer remains same until it exceed the char count after that capacity = (currentCapacity + 1) * 2

class StrBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();

		System.out.println(sb.capacity()); // 16
		System.out.println(sb);            // 

		sb.append("Shashi");
		System.out.println(sb.capacity()); // 16
		System.out.println(sb);            // Shashi
		
		sb.append("Bagal");
		System.out.println(sb.capacity()); // 16
		System.out.println(sb);            // ShashiBagal
		
		sb.append("Core2Web");
		System.out.println(sb.capacity()); // 34
		System.out.println(sb);            // ShashiBagalCore2Web

	}
}
