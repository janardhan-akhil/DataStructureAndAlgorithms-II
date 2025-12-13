package interviewPractice;

public class SubSequenceString {
	static boolean IsSubSequence(String s1, String s2) {
		int i = 0, j = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				i++;
				j++;
			} else {
				if (j < s2.length()) {
					j++;
				}

			}
		}
		return i==s1.length();
	}

	public static void main(String[] args) {
		String s1 = "aec";
		String s2 = "abcde";
		System.out.println(IsSubSequence(s1, s2));

	}

}
