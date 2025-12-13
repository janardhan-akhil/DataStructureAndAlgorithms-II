package interviewPractice;

public class MergeStringsAlternatively {
	
	static String mergeStrings(String s1, String s2) {
		String res = "";
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		int i=0,j=0;
		while(i<ch1.length && i<ch2.length) {
			res = res+ch1[i]+ch2[j];
			i++;
			j++;
		}
		while(i<ch1.length) {
			res = res+ch1[i];
			i++;
		}
		while(j<ch2.length) {
			res = res+ch2[j];
			j++;
		}
		return res;
	}
	static String mergeStringsII(String s1, String s2) {
		int i = 0,j=0,k=0;
		int m = s1.length();
		int n = s2.length();
		char[] ch = new char[m+n];
		while(i<m || j<n) {
			if(i<m) ch[k++] = s1.charAt(i++);
			if(j<n) ch[k++] = s2.charAt(j++);
		}
		return new String(ch);
		
	}

	public static void main(String[] args) {
		String s1 = "abcd";
		String s2 = "pq";
		System.out.println(mergeStrings(s1, s2));
		System.out.println(mergeStringsII(s1, s2));

	}

}
