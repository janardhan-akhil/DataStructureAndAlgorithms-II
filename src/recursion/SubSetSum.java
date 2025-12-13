package recursion;

public class SubSetSum {
	static int subSetSum(int[] arr,int key) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]+arr[j] == key) {
					count++;
				}
			}
		}
		return count;
	}
	static int subSetSum1(int[] arr,int sum, int i) {

		if(sum < 0 ) {
			return 0;
		}
		if(sum == 0) {
			return 1;
		}
		if(i == arr.length) {
			return 0;
		}
		return subSetSum1(arr, sum-arr[i],i+1) + subSetSum1(arr,sum,i+1);
	}

	public static void main(String[] args) {
		//System.out.println(subSetSum(new int[] {10,20,15,5}, 25));
		System.out.println(subSetSum1(new int[] {10,20,15,5}, 25, 0));
		

	}

}
