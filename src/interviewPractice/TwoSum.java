package interviewPractice;


public class TwoSum {
	static int[] twoSum(int[] arr, int target) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j]==target) {
					return new int[] {i,j};
				}
			}
		}
		return arr;
	}
	
	static int[] twoSumII(int[] arr,int target) {
		int i = 0, j=arr.length-1;
		while(i<=j) {
			if(arr[i]+arr[j] == target) {
				return new int[] {i,j};
			}else if(arr[i]+arr[j] > target) {
				j--;
			}else {
				i++;
			}
		}
		return new int[] {-1,-1};
	}

	public static void main(String[] args) {
		int[] arr = {2,7,11,15,16,18};
		int target = 29;
		int[] a = twoSum(arr, target);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		int[] ar = twoSumII(arr, target);
		for(int i=0;i<ar.length;i++) {
			System.out.print(ar[i]+" ");
		}

	}

}
