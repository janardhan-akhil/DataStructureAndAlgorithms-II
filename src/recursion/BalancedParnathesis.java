package recursion;

public class BalancedParnathesis {
	static void balancedPanthesis(char[] arr, int n, int i, int o, int c) {
		if(i == arr.length) {
			System.out.println(arr);
		}
		if(o<n) {
			arr[i] = '(';
			balancedPanthesis(arr, n, i+1, o+1, c);
		}
		if(c<o) {
			arr[i] = ')';
			balancedPanthesis(arr, n, i+1, o, c+1);
		}
	}

	public static void main(String[] args) {
		int n = 2;
		char[] arr = new char[n*2];
		balancedPanthesis(arr, n, 0, 0, 0);

	}

}
