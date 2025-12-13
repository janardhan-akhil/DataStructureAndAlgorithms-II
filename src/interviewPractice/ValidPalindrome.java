package interviewPractice;

public class ValidPalindrome {
	static boolean validPalindrome(String s) {

		String s1 = s.toLowerCase();
		StringBuilder s2 = new StringBuilder();
		for (int i = 0; i < s1.length(); i++) {
			
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z' || s1.charAt(i)>= '0' && s1.charAt(i)<='9') {
				s2.append(s1.charAt(i));

			}
		}

		int i = 0, j = s2.length() - 1;
		while (i < j) {
			if (s2.charAt(i) != s2.charAt(j)) {
				return false;
			}
				i++;
				j--;

		}
		return true;
	}

	public static void main(String[] args) {
		String s ="1b1";
		System.out.println(validPalindrome(s));
	}

}
