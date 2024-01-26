public class isPermutation {
	/*
	 * given two strings write a function to decide if one is permutation of the
	 * other
	 */

	public static boolean isPermutation(String s1, String s2) {
		if (s1.length() != s2.length()) {
			return false;
		}

		int[] char_set = new int[128];

		for (int i = 0; i < s1.length(); i++) {
			int ch = s1.charAt(i);
			char_set[ch]++;
		}

		for (int i = 0; i < s2.length(); i++) {
			int ch_s2 = s2.charAt(i);
			char_set[ch_s2]--;
			if (char_set[ch_s2] < 0)
				return false;
		}
		for (int count : char_set) {
			if (count != 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		boolean res = isPermutation("bok", "kbo");
		if (res) {
			System.out.println("they are permutations");
		} else {
			System.out.println("they are NOT permutations");
		}
	}
} /*
	 * my algo is: time-> O(n) and space -> O(1) bc char_set is always same. not
	 * changing
	 * depending on the len of strings.
	 */

/*
 * book's algo is to sort&compare strings. much simpler.
 *
 * String sort(String s) {
 * char[] content = s.toCharArray();
 * java.util.Arrays.sort(content);
 * return new String(content); // tekrar stringe geri çeviriyoruz
 * }
 *
 * boolean isPermutation(String s1, String s2) {
 * if (s1.length != s2.length) {
 * return false;
 * }
 * return sort(s1).equals(sort(s2));
 * }
 *
 * it is O(n log(n)) for time. Sorting the character array using
 * Arrays.sort(content) typically has a time complexity of O(n log n), where n
 * is the length of the array content.
 * and O(1) for space
 */
