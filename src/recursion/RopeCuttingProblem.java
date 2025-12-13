package recursion;

public class RopeCuttingProblem {
	static int ropeCutting(int n, int a, int b, int c) {
		if(n == 0) {
			return 0;
		}else if(n<0){
			return -1;
		}
		int temp1 = ropeCutting(n-a, a, b, c);
		int temp2 =ropeCutting(n-b, a, b, c);
		int temp3 =ropeCutting(n-c, a, b, c);
		;
		int pieces = Math.max(Math.max(temp1, temp2), temp3);
		if(pieces == -1) {
			return -1;
		}
		return pieces+1;
	}

	public static void main(String[] args) {
		System.out.println(ropeCutting(15, 5, 8, 7));
		

	}

}
