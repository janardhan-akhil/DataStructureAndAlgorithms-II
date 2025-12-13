package interviewPractice;

public class MinSizeSubarraySum {
	static int minSizeSubarraySum(int[] arr, int target) {
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		int sum = 0;
		for(int  end= 0;end < arr.length;end++) {
			sum = sum+arr[end];
			
			while(sum >= target) {
				minLength = Math.min(minLength, end - start + 1);
                sum =sum - arr[start];
                start++;
			}
		}
		return minLength == Integer.MAX_VALUE ? 0 : minLength;
	}

	public static void main(String[] args) {
		int[] arr = {1,4,4};
		int target = 10;
		
		System.out.println(minSizeSubarraySum(arr, target));

	}

}
