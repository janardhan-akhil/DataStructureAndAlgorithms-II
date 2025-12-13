package interviewPractice;

public class LengthOfLastWord {
	static int lengthOfLastWord(String s) {
		int len = 0;
		String trim = s.trim();
		for(int i=trim.length()-1;i>=0;i--) {
			if(trim.charAt(i) != ' ') {
				len++;
			}else {
				break;
			}
		}
		return len;
	}

	public static void main(String[] args) {
		String s = "   HelloWorld    ";
		System.out.println(lengthOfLastWord(s));


	}

}
