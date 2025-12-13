package interviewPractice;

public class RearrangingArrayBySign {
	static int[] rearrangingBySign(int[] arr) {
		int[] res = new int[arr.length];
		int posIndex = 0;
		int negIndex = 1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 1) {
				res[posIndex] = arr[i];

				posIndex = posIndex + 2;
			} else {
				res[negIndex] = arr[i];

				negIndex = negIndex + 2;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -1, -2, -3 };
		int[] res = rearrangingBySign(arr);
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

}
