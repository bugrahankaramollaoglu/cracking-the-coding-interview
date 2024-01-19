/* bunun bigO'su O(n^2) çünkü iki inner loop var n*n adet
 * eleman yazdırılıyor o da n^2 zaman tutuyor
 */

class class_5 {
	void printPairs(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int i2 = 0; i2 < arr.length; i2++) {
				System.err.println(arr[i] + ", " + arr[i2]);
			}
		}
	}
}
