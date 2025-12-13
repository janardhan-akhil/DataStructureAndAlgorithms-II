package interviewPractice;

public class CanPlaceFlowers {
	static boolean canPlaceFlowers(int[] arr, int n) {
		int count = 0;
		int len = arr.length;
		for(int i=0;i<len;i++) {
			if(arr[i] == 0) {
				boolean leftEmpty = ((i == 0) || arr[i-1]==0);
				boolean rightEmpty = ((i == len-1) || arr[i+1]==0);
				
				if(leftEmpty && rightEmpty) {
					arr[i] = 1;
					count++;
					if(count>=n) return true;
				}
			}

		}
		return count>=n;
		
	}

	public static void main(String[] args) {
		int[] arr = {1,0,0,0,1};
		int n=2;
		System.out.println(canPlaceFlowers(arr, n));

	}

}
