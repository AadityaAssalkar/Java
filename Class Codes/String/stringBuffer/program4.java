// We can also define the initial capacity for a StringBuffer

class StrBuffer {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer(100); // 100 is the initial capacity

		sb.append("Biencaps");
		sb.append("Core2Web");

		System.out.println(sb.capacity()); // 100
		System.out.println(sb);

		sb.append("Incubator");
		System.out.println(sb.capacity()); // 100
		System.out.println(sb);
	}
}
