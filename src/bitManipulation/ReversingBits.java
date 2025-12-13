package bitManipulation;

public class ReversingBits {
	
	static int reveresingBits(int n) {
		int rev = 0;
		int fir = 31, last = 0;
		while(fir>last) {
			if((n & (1<<fir)) !=0){
				rev = rev | (1<<last);
			}
			if((n & (1<<last)) !=0){
				rev = rev | (1<<fir);
			}
			fir--;
			last++;
		}
		return rev;
	}

	public static void main(String[] args) {
		int n = 10;
		System.out.println(reveresingBits(n));
		

	}

}
