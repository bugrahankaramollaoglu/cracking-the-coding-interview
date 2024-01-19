/* bunun karmasıklıgı O(len_a * len_b) */

class class_7 {
	void fun(int[] a, int[] b) {
		for (int i = 0; i < a.length;i++) {
			for (int i2 = 0; i2 < b.length; i2++) {
				System.err.println(a[i] + ", " + b[i2]);
			}
		}
	}
}
