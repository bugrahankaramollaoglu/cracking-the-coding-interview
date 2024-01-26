
class class_2 {
	/*
	 * complexity for this is
	 * O(len_a + len_b)
	 */
	static int[] arr_a = new int[30];
	static int[] arr_b = new int[30];

	public static void fun1() {
		for (int a : arr_a) {
			System.err.println(a);
		}
		for (int b : arr_b) {
			System.err.println(b);
		}
	}

	/*
	 * complexity for this is
	 * O(len_a * len_b)
	 */
	public static void fun2() {
		for (int a : arr_a) {
			for (int b : arr_b) {
				System.err.println(a + " " + b);
			}
		}
	}
}
