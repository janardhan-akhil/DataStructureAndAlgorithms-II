package recursion;

public class SumOfElementsInArray {
	
	static int sumOfElements(int[] arr,int i) {
		if(i==arr.length) {
			return 0;
		}
		return sumOfElements(arr, i+1) + arr[i];
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		System.out.println(sumOfElements(arr, 0));

	}

}
