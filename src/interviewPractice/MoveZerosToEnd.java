package interviewPractice;

public class MoveZerosToEnd {

	static int[] moveZerosToEnd(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] != 0) {
				arr[j++] = arr[i];
			}
			
		}
		while(j < arr.length) {
			arr[j++] = 0;
		}
		return arr;

	}
	
	static int[] moveZerosToStart(int[] arr) {
		int j=arr.length-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i] != 0) {
				arr[j--] = arr[i];
			}
		}
		while(j>=0) {
			arr[j--] = 0;
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 2, 0,3,0,3,0,3,0,3,0,1,0,1,0,1};
		int[] res = moveZerosToEnd(arr);
		int[] res1 = moveZerosToStart(arr);
		for(int i=0;i<res1.length;i++) {
			System.out.print(res1[i]+" ");
		}
	}

}
