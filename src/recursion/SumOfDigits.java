package recursion;

public class SumOfDigits {
	static int sumOfDigits(int n) {
		if(n == 0) {
			return 0;
		}
		return sumOfDigits(n/10)+(n%10);
		
		
	}

	public static void main(String[] args) {
		int n = 12345;
		System.out.println(sumOfDigits(n));

	}

}
