package bitManipulation;

public class TrailingZeros {
	static int trailingZeros(int n) {
		return (int) (Math.log10((n & n-1) ^ n) / Math.log10(2));
	}

	public static void main(String[] args) {
		int n = 16;
		System.out.println(trailingZeros(n));
	}

}
