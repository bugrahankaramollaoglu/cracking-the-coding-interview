/* iki tane str var, str1 ve str2. soru şu:
   str1, str2dekilerle yazılabilir mi? */

import java.util.HashMap;
import java.util.Map;

public class canBeWritten {

	public static boolean canBeWritten(String s1, String s2) {

		HashMap<Character, Integer> freq_s1 = new HashMap<>();
		HashMap<Character, Integer> freq_s2 = new HashMap<>();

		for (char c : s1.toCharArray()) {
			freq_s1.put(c, freq_s1.getOrDefault(c, 0) + 1);
		}

		for (char c : s2.toCharArray()) {
			freq_s2.put(c, freq_s2.getOrDefault(c, 0) + 1);
		}

		for (Character key : freq_s1.keySet()) {
			if (!freq_s2.containsKey(key))
				return false;
		}

		for (Map.Entry<Character, Integer> entry : freq_s1.entrySet()) {
			char key = entry.getKey();
			int value1 = entry.getValue();
			int value2 = freq_s2.getOrDefault(key, 0);

			if (value1 > value2) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(canBeWritten("abbcb", "abababababbababacb")); // true
		System.out.println(canBeWritten("abbcb", "abc")); // false

	}
}
