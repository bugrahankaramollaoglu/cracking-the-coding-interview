public class isPermutation {
	/*
	 * given two strings write a function to decide if one is permutation of the
	 * other
	 */

	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		boolean[] char_set = new boolean[128];

		for (int i = 0; i < s1.length(); i++) {
			int ch = s1.charAt(i);
			char_set[ch] = true;
		}
		
		for (int i = 0; i < char_set.length && i < s2.length(); i++) {
			int ch_s2 = s2.charAt(i);
			if (char_set[ch_s2] == false) {
				return false;
			}
		}
		return;
	}

	public static void main(String[] args) {

		isPermutation("ccabd", "dab");
	}
}
