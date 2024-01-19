/* The first loop iterates through the array to calculate the sum.
Since it visits each element of the array once, the time
complexity of the first loop is O(n)O(n).
The second loop iterates through the array to calculate
the product. Similar to the first loop, it visits each element
once, resulting in a time complexity of O(n) */

class class_4 {
	public static void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		for (int i = 0; i < array.length; i++) {
			product *= array[i];
		}
		System.out.println(sum + ", " + product);
	}
}
