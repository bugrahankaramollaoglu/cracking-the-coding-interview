public class URLify {
	/* replace all spaces with '%20' */
	public static String replace(String s) {
		StringBuilder content = new StringBuilder(s);
		for (int i = 0; i < s.length(); i++) {
			char ch = content.charAt(i);
			if (ch == ' ') {
				content.replace(i, i + 1, "%20");
				i += 2; // so that %,2,0 will not be compared with ' ' in vain
			}
		}
		s = content.toString();
		return s;
	}

	public static void main(String[] args) {
		System.out.println(replace("bugra kara molla"));
	}
} /* O(n) */
