package bitManipulation;

public class LongestConsecutive1s {

	static boolean isConsecutive1s(int n) {
		if ((n & (n << 1)) != 0) {
			return true;
		} else {
			return false;
		}
	}

	static int lengthOfConsecutive1s(int n) {
		int count = 0;
		while (n > 0) {

			n = n & (n << 1);
			count++;

		}
		return count;

	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(isConsecutive1s(n));
		System.out.println(lengthOfConsecutive1s(n));

	}

}
