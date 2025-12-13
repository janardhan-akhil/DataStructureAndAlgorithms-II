package matrices;

public class RotateImage {
	static void rotateImage(int[][] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = arr.length - 1; i >= 0; i--) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

	static void rotateII(int[][] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			int left = 0, right = arr[0].length - 1;
			while (left < right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				left++;
				right--;
			}
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotateImage(arr);
		System.out.println();

	}

}
