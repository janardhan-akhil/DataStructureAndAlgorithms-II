package interviewPractice;

public class ReverseWords {
	public static String reverseWords(String s) {
		String rev = "";
		String[] split = s.trim().split("\\s+");
		for(int i=split.length-1;i>=0;i--) {
			if(i !=0 && i<split.length) {
				rev = rev+split[i]+" ";
			}else {
				rev = rev+split[i];
			}
			
		}
		return rev;
	}
	
	static String reverse(String s) {
		// Step 1: Trim leading/trailing spaces
        s = s.trim();
        
        // Step 2: Split by one or more spaces using regex
        String[] words = s.split("\\s+");
        
        // Step 3: Reverse the array of words
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        
        return sb.toString();
	}

	public static void main(String[] args) {
		String s = "a good   example";
		System.out.println(reverseWords(s));
		System.out.println(reverse(s));

	}

}
