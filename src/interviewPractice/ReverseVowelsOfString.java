package interviewPractice;

public class ReverseVowelsOfString {
	static String reverseVowels(String s) {
		if (s == null || s.length() == 0) return s;

        // Convert string to char array
        char[] chars = s.toCharArray();

        // Define vowels
        String vowels = "aeiouAEIOU";

        int left = 0, right = chars.length - 1;

        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && vowels.indexOf(chars[left]) == -1) {
                left++;
            }

            // Move right pointer to the previous vowel
            while (left < right && vowels.indexOf(chars[right]) == -1) {
                right--;
            }

            // Swap vowels
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;

            left++;
            right--;
        }

        return new String(chars);
	}

	public static void main(String[] args) {
		String s = "LeetCode";
		System.out.println(reverseVowels(s));
		

	}

}
