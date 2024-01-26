/* this is a re-implementation of StringBuilder */

public class my_string_builder {
	private char[] buffer;
	private int size;
	private static final int DEF_CAPACITY = 16;

	public my_string_builder() {
		this.buffer = new char[DEF_CAPACITY];
		this.size = 0;
	}

	public my_string_builder(int capacity_given) {
		this.buffer = new char[capacity_given];
		this.size = 0;
	}

	public my_string_builder append(String str) {
		if (str == null) {
			str = "null";
		}

		int str_len = str.length();
		ensureCapacity(size+str_len);
		str.getChars(0, str_len, buffer, size);
		size += str_len;
		return this;
	}

	public my_string_builder insert(int start, String str) {
		if (str == null) {
			str = "null";
		}
		if (start < 0 || start > size) {
			throw new IndexOutOfBoundsException("invalid start position");
		}
		int str_len = str.length();
		ensureCapacity(size+str_len);
		// Shift existing characters to make space for the inserted string
		System.arraycopy(buffer, start, buffer, start + str_len, size - start);
		str.getChars(0, str_len, buffer, start);
		size += str_len;
		return this;
	}

	public my_string_builder delete(int start, int end) {
		if (start < 0 || start >= size || end <= start || end > size) {
			throw new IndexOutOfBoundsException("invalid start position");
		}
		int len = end - start;
		// Shift remaining characters left after deletion
		System.arraycopy(buffer, end, buffer, start, size - end);
		size -= len;
		return this;
	}

	public my_string_builder replace(int start, int end, String str) {
		delete(start, end);
		insert(start, str);
		return this;
	}

	@Override
	public String toString() {
		return new String(buffer, 0, size);
	}

	private void ensureCapacity(int capacity) {
		/* ArrayList kapasitesi dolarsa kapasitesini ikiye katlar */
		if (capacity > buffer.length) {
			int newCapacity = Math.max(buffer.length * 2, capacity);
			char[] newBuffer = new char[newCapacity];
			System.arraycopy(buffer, 0, newBuffer, 0, size);
			buffer = newBuffer;
		}
	}

	public static void main(String[] args) {
		my_string_builder builder = new my_string_builder();
		builder.append("Hello ");
		builder.append("world.");
		builder.insert(6, "to "); // araya to ekledik
		builder.delete(6, 9); // aradaki to2yu sildik
		builder.replace(6, 11, "WORLD");
		System.out.println(builder.toString()); // Output: Hello Java World
	}

}
