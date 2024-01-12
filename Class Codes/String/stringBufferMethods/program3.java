// Method 3: public synchronized StringBuffer delete(int start, int end);

// Description:
// - Delete characters from this StringBuffer. delete(10, 12) will delete 10 and 11, but not 12
// - It is harmless for end to be larger than length().

// parameters:
// - Integer(start the first character to delete),
// - Integer(end the index after the last character to delete).
// return type: StirngBuffer(this StringBuffer).

class SBDemo {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Core2Web");
		sb.delete(2, 7);
		System.out.println(sb);
	}
}
