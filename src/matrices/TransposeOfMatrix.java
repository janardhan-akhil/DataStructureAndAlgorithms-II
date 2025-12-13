package matrices;

public class TransposeOfMatrix {
	static int[][] transposeMatrix(int[][] arr){
		int m = arr.length;
		int n = arr[0].length;
		int[][] res = new int[n][m];
		
		for(int i = 0;i<m;i++) {
			for(int j=0;j<n;j++) {
				res[j][i] = arr[i][j];
			}
		}
		return res;
	}
	
	static int[][] transposeMatrixII(int[][] arr){
		for(int i=0;i<arr.length-1;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = arr[i][j];
				arr[i][j]= arr[j][i];
				arr[j][i] = temp;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = {{1,2,3,},{4,5,6},{7,8,9}};
//		int[][] r = transposeMatrix(arr);
//		int m = r.length;
//		int n = r[0].length;
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(r[i][j]+" ");
//			}
//			System.out.println();
//		}
		
		int[][] r = transposeMatrixII(arr);
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<r.length;j++) {
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}

	}

}
