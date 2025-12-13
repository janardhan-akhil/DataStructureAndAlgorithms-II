package recursion;

public class PalindromeUsingRecursion {
	static boolean checkPalindrome(String s, int i, int j) {
		if (s.charAt(i) != s.charAt(j)) {
			return false;
		}
		if (j<=i) {
			return true;
		}
		return checkPalindrome(s, i + 1, j - 1);
	}

	public static void main(String[] args) {
		String s = "racecar";
		System.out.println(checkPalindrome(s, 0, s.length() - 1));

	}

}
