package interviewPractice;

public class DivideTwoIntegers {
	static int divideTwoIntegers(int dividend, int divisor) {
		if(dividend == Integer.MIN_VALUE && divisor == -1) {
			return Integer.MAX_VALUE;
		}
		return dividend/divisor;
	}
	static int divideTwoIntegers1(int dividend, int divisor) {
		int a = (int)(dividend/divisor);
		int max = (int)(Math.pow(2,31)-1);
		int min = (int)(Math.pow(-2,31));
		
		if(a>max) {
			return Integer.MAX_VALUE;
		}else if(a<min) {
			return Integer.MIN_VALUE;
		}else {
			return a;
		}
	}

	public static void main(String[] args) {
	
		System.out.println(divideTwoIntegers(7, -3));
		System.out.println(divideTwoIntegers1(-2147483648, -1));


	}

}
