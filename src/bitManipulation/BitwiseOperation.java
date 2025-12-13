package bitManipulation;

public class BitwiseOperation {
	static int posOfRMSB(int n) {
		return (int)(Math.log10(n ^ (n & (n-1)))/ Math.log10(2)) + 1;
	}
	static int countSetBits(int n) {
		int count = 0;
		while(n >0) {
			n = n & (n-1);
			count++;
		}
		return count;
	}
	static boolean powerOf2(int n) {
		if(n == 0) {
			return false;
		}
		return ((n & (n-1)) == 0);
	}

	public static void main(String[] args) {
		int n=16;
		//System.out.println(posOfRMSB(n));
		//System.out.println(countSetBits(n));
		System.out.println(powerOf2(n));
		

	}

}
