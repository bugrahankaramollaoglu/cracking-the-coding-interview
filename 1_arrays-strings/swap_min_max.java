import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* swap min and mix numbers in an int element. assume min/max are unique */

public class swap_min_max {

	public static int find_max(int[] arr) {
		int max = arr[0];
		int max_indice = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
				max_indice = i;
			}
		}
		return max_indice;
	}

	public static int find_min(int[] arr) {
		int min = arr[0];
		int min_indice = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				min_indice = i;
			}
		}
		return min_indice;
	}

	public static void main(String[] args) {

		int[] arr = { 10, 2, 55, 94 }; // olması gereken -> {10, 94, 55, 2}

		swap(arr);
		printArr(arr);

	}

	private static void swap(int[] arr) {

		int min_indice = find_min(arr);
		int max_indice = find_max(arr);

		int temp = arr[max_indice];
		arr[max_indice] = arr[min_indice];
		arr[min_indice] = temp;

	}

	private static void printArr(int[] arr) {
		for (int elem : arr) {
			System.out.print(elem + " ");
		}
		System.out.println();
	}
}
