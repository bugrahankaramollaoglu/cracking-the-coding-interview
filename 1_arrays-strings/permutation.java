/* permutations (substrings) of a string.
assume all characters unique */

class permutation {

	public static void permutate(String str, int left, int right) {
		if (left == right) {
			System.out.println(str);
		} else {
			for (int i = left; i <= right; i++) {
				str = swap(str, left, i);
				permutate(str, left + 1, right);
				str = swap(str, left, i);
			}
		}
	}

	public static String swap(String a, int i, int j) {
		char tmp;
		char[] char_arr = a.toCharArray();
		tmp = char_arr[i];
		char_arr[i] = char_arr[j];
		char_arr[j] = tmp;
		return String.valueOf(char_arr);
	}

	public static void main(String[] args) {
		String str = "bac";
		int n = str.length();
		permutate(str, 0, n - 1);
	}
}
