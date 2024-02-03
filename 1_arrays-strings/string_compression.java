import java.util.Scanner;

public class string_compression {

	/*
	 * aabcccccaaa -> a2b1c5a3
	 * if conversed str is longer, return
	 * original str. only az-AZ
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a string: ");
		String str = scanner.nextLine();
		scanner.close();
		StringBuilder sb = new StringBuilder();

		int nb = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				nb++;
			} else {
				sb.append(str.charAt(i));
				sb.append(nb);
				nb = 1;
			}
		}
		String compressedString = sb.toString();
		String res = compressedString.length() < str.length() ? compressedString : str;
		System.out.println(res);
	}
}
