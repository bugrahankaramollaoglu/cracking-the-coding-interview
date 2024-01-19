/* constnatların önemi olmadığından bunun karmasıklıgı da O(len_a*len_b) */

class class_8 {
	void fun(int[] a, int[] b) {
		for (int i = 0; i < a.length; i++) {
			for (int i2 = 0; i2 < b.length; i2++) {
				for (int x = 0; x < 10000; x++) {
					System.err.println(a[i] + ", " + b[i2]);
				}
			}
		}
	}
}
