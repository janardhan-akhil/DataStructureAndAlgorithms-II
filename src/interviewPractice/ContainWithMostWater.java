package interviewPractice;

public class ContainWithMostWater {
	
	static int containsWithMostWater(int[] arr) {
		int max = 0;
		int i = 0, j = arr.length-1;
		while(i<j) {
			int minHeight = Math.min(arr[i], arr[j]);
			int width = (j-i);
			int area = width * minHeight;
			max = Math.max(max, area);
			
			if(arr[i]<arr[j]) {
				i++;
			}else {
				j--;
			}
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {7,3,4,1,8,9,6};
		System.out.println(containsWithMostWater(arr));

	}

}
