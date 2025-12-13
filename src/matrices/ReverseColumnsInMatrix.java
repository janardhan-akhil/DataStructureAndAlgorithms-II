package matrices;

public class ReverseColumnsInMatrix {
	
	static void reverseColumn(int[][] arr){
		int m = arr.length;
		int n = arr[0].length;
		int[][] res = new int[m][n];
	
		for(int i=0;i<arr.length;i++) {
			for(int j=arr[0].length-1;j>=0;j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
	static int[][] reverseColumnII(int[][] arr){
		for(int i=0;i<arr.length;i++) {
			int left =0, right = arr[0].length-1;
			while(left<right) {
				int temp = arr[i][left];
				arr[i][left] = arr[i][right];
				arr[i][right] = temp;
				left++;
				right--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[][] arr = {{1,6,11,16,21},{2,7,12,17,22},{3,8,13,18,23},
				{4,9,14,19,24},{5,10,15,20,25}};
		reverseColumn(arr);
		System.out.println();
		int[][] r = reverseColumnII(arr);
		for(int i=0;i<r.length;i++) {
			for(int j=0;j<r.length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
