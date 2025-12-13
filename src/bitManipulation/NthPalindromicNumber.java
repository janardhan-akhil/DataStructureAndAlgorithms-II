package bitManipulation;

public class NthPalindromicNumber {
	
	static int reverseBinary(int n, int len) {
		int rev = 0;
		int fir = len-1, last = 0;
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
	
	static int nthPalindromicNumber(int n) {
		int l =0, count =0;
		while (count < n) {
			l++;
			count+=(int)Math.pow(2, (l-1)/2);
		}
		count-=(int)Math.pow(2, (l-1)/2);
		int ele = n- count-1;
		int ans = (1<<(l-1)) | (ele<<(l/2));
		ans = ans | reverseBinary(ans, l);
		return ans;
	}

	public static void main(String[] args) {
		int n=21;
		System.out.println(Integer.toBinaryString(nthPalindromicNumber(n)));

	}

}
