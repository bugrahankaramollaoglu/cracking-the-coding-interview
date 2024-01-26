/* if a string is all unique characters. */
public class isUnique {
	public static int count(String str, char ch) {
		int count = 0;
		for (char cha : str.toCharArray()) {
			if (cha == ch) {
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {

		String test = "aosnjfh54ım";
		for (char cha : test.toCharArray()) {
			if (count(test, cha) > 1) {
				System.out.println("It involves multiple instances of a character.");
				return;
			}
		}
		System.out.println("It is of all unique characters.");
		return;
	}
} /* my algo is O(n^2) for it is quadratic. poor implementation. */

/*
 * Book's solution, much better. O(n) space and O(1) time. n is len of str.
 *
 * boolean isUnique(String str) {
 * if (str.length() > 128) return false; // smart
 * boolean[] char_set = new boolean[128];
 * for (int i = 0; i < str.length(); i++) {
 * int val = str.charAt(i); // önce str[0]ı buluyor
 * if (char_set[val]) // already found before
 * return false;
 * char_set[val] = true;
 * }
 * return true;
 * }
 *
 */
