package interviewPractice;

public class CountSetBits {
	static int decimalToBinary(int n) {
		String b = "";
		while(n>0) {
			int x = n%2;
			b = x+b;
			n = n/2;
		}
		int count = 0;
		for(int i=0;i<b.length();i++) {
			if(b.charAt(i)== '1') {
				count++;
			}
		}
		return count;
	}
	

	public static void main(String[] args) {
		int n = 2147483645;
		System.out.println(decimalToBinary(n));

	}

}
