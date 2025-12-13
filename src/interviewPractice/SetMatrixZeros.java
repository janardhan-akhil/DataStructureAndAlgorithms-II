package interviewPractice;

public class SetMatrixZeros {
	static void setMatrixZeros(int[][] arr) {
		int m = arr.length;
		int n = arr[0].length;

		boolean firstRowZero = false;
		boolean firstColZero = false;

		for (int i = 0; i < m; i++) {
			if (arr[i][0] == 0) {
				firstColZero = true;
				break;
			}
		}
		for (int j = 0; j < n; j++) {
			if (arr[0][j] == 0) {
				firstRowZero = true;
				break;
			}
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[i][j] == 0) {
					arr[i][0] = 0;
					arr[0][j] = 0;
				}
			}
		}

		for (int i = 1; i < m; i++) {
			for (int j = 1; j < n; j++) {
				if (arr[i][0] == 0 || arr[0][j] == 0) {
					arr[i][j] = 0;
				}
			}
		}

		if (firstColZero) {

			for (int i = 0; i < m; i++) {
				arr[i][0] = 0;
			}
		}
		if (firstRowZero) {

			for (int j = 0; j < n; j++) {
				arr[0][j] = 0;
			}
		}
		
		for(int i =0;i<m;i++) {
			for(int j =0;j<n;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int[][] arr = { { 0,1,2,0}, { 3,4,5,2 }, { 1,3,1,5 } };
		setMatrixZeros(arr);

	}

}
