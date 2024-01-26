public class isPalindrome {

	public static boolean isPal(String ss) {

		/*
		 * you can reverse strings in 3 ways in java
		 * StringBuilder sb.reverse()
		 * char[] array + loop (my choice)
		 * java8 streams
		 */

		String ss_rev = ss;

		char[] content = ss_rev.toCharArray();

		int start = 0, end = content.length - 1;

		while (start < end) {
			char tmp = content[start];
			content[start] = content[end];
			content[end] = tmp;
			start++;
			end--;
		}

		ss_rev = new String(content);
		return ss.equals(ss_rev);
	}

	public static void main(String[] args) {
		if (isPal("abccba"))
			System.out.println("it is palindrome");
		else
			System.out.println("it is NOT palindrome");
	}
} /* it is T:O(n) and S:O(n)*/
