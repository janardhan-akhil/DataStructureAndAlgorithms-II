package interviewPractice;

public class ProductOfNElements {
	static int[] product(int[] arr) {
		int product = 1;
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			product = product * arr[i];
		}
		for(int i=0;i<arr.length;i++) {
			res[i] = product/arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int[] res1 = product(arr);
		for(int i=0;i<res1.length;i++) {
			System.out.print(res1[i]+" ");

	}
	}
}
