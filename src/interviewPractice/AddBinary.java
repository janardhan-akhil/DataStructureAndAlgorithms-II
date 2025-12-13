package interviewPractice;

import java.math.BigInteger;
import java.util.LinkedList;

public class AddBinary {
	
	static String addBinary(String a, String b) {
		StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        // Loop until both strings are processed
        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            result.append(sum % 2);     // Add the bit to result
            carry = sum / 2;            // Update carry

            i--;
            j--;
        }

        return result.reverse().toString();
	}
	
	static String addBinaryII(String s1, String s2) {
		BigInteger num1 = new BigInteger(s1, 2);  // base 2
        BigInteger num2 = new BigInteger(s2, 2);  // base 2

        BigInteger sum = num1.add(num2);
        return sum.toString(2);
	}

	public static void main(String[] args) {
		String s1 = "1010";
		String s2 = "1011";
		System.out.println(addBinary(s1, s2));
		//System.out.println(addBinaryII(s1, s2));
		
		
	}

}
