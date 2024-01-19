/* bunda da karmaşıklık O(n^2/2) oluyor ama bigO notasyonunda
 * constantların önemi olmadıgından O(n^2) şeklinde sadeleştiriliyor
 */

class class_6 {
	void printPairs2(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int i2 = i + 1; i2 < arr.length; i2++) {
				System.err.println(arr[i] + ", " + arr[i2]);
			}
		}
	}
}
