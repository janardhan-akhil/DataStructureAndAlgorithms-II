package interviewPractice;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	static boolean happyNumber(int n) {
		
		Set<Integer> set = new HashSet<>();
		
		while( n != 1) {
			if(set.contains(n)) {
				return false;
			}
			set.add(n);
			n = getSquaresOfN(n);
		}
		return true;
	}
	
	static int getSquaresOfN(int n) {
		int sum = 0;
		while(n>0) {
			int x = n %10;
			sum = sum + x*x;
			n = n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 2;
		System.out.println(happyNumber(n));
	}

}
