package interviewPractice;

public class MaxAverageSubArray {
	
	static double maxAverageSubArray(int[] arr, int k) {
		double maxSum = 0.0;
		double sum = 0;
		for(int i=0;i<k;i++) {
			sum = sum+arr[i];
		}
		maxSum = sum;
		for(int i=k;i<arr.length;i++) {
			sum+=arr[i]-arr[i-k];
			maxSum = Math.max(maxSum, sum);
		}
		return maxSum/k;
	}

	public static void main(String[] args) {
		int[] arr = {1,12,-5,-6,50,3};
		int k=4;
		System.out.println(maxAverageSubArray(arr, k));

	}

}
