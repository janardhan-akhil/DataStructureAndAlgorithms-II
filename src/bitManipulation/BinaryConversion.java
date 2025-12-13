package bitManipulation;

public class BinaryConversion {
	static String decimalToBinary(int n) {
		String b = "";
		while(n!=0) {
			int x = n%2;
			b = x+b;
			n = n/2;
		}
		return b;
	}
	
	static int binaryToDeciaml(String b) {
		int res = 0;
		int powerof2 = 1;
		for(int i = b.length()-1;i>=0;i--) {
			if(b.charAt(i) == '1') {
				res = res + powerof2;
			}
			powerof2 = powerof2 *2;
		}
		return res;
	}

	public static void main(String[] args) {
		int n = 26;
		String s = "101101";
		byte a = 26;
		byte b = 9;
		//System.out.println(5 ^ 9);
		//System.out.println(~20);
		System.out.println(decimalToBinary(n));
		//System.out.println(binaryToDeciaml(s));

	}

}
