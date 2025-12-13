package bitManipulation;

public class SwapEvenAndOddPositions {
	static int swap(int n) {
		return ((n & 0xaaaaaaaa)>>>1) | ((n & 0x55555555)<<1);
	}

	public static void main(String[] args) {
		int n = 181;
		System.out.println(swap(n));
		

	}

}
