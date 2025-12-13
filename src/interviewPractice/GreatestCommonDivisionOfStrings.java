package interviewPractice;



public class GreatestCommonDivisionOfStrings {
	static String greatestCommonDivisior(String s1, String s2) {
		if(!(s1 + s2).equals(s2 + s1)) {
			return "";
		}
		 
		int gcdLength = gcd(s1.length(), s2.length());
		return s1.substring(0,gcdLength);
		
		
	}
	private static int gcd(int a, int b) {
		return b==0 ? a : gcd(b, a%b);
	}

	public static void main(String[] args) {
		String s1 = "ABCDEF";
		String s2 = "ABc";
		
		System.out.println(greatestCommonDivisior(s1, s2));

	}

}
