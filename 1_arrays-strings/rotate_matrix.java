public class rotate_matrix {
	/*
	 * rotate an NxN matrix by 90-degrees in place.
	 * each pixel in the image is 4byte.
	 *
	 */
	public static void rotater(int[][] matrix) {

		int n = matrix.length;

		for (int layer = 0; layer < n / 2; layer++) {
			int first = layer;
			int last = n - 1 - layer;
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i];
				// Left -> Top
				matrix[first][i] = matrix[last - offset][first];
				// Bottom -> Left
				matrix[last - offset][first] = matrix[last][last - offset];
				// Right -> Bottom
				matrix[last][last - offset] = matrix[i][last];
				// Top -> Right
				matrix[i][last] = top;
			}
		}
	}

	public static void main(String[] args) {
		int[][] matrix = {
				{ 1, 2, 3, 4 },
				{ 5, 6, 7, 8 },
				{ 9, 10, 11, 12 },
				{ 13, 14, 15, 16 }
		};

		System.out.println("Original Matrix:");
		printMatrix(matrix);

		rotater(matrix);

		System.out.println("Rotated Matrix:");
		printMatrix(matrix);
	}

	public static void printMatrix(int[][] matrix) {
		for (int[] row : matrix) {
			for (int nb : row) {
				System.out.print(nb + " ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
