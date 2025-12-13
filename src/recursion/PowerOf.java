package recursion;

public class PowerOf {
	static long powerOf(int x, int y) {
		if(y==0) {
			return 1;
		}if(y%2 == 0) {
			long res = powerOf(x, y/2);
			return res * res;
		}else {
			return powerOf(x, y-1) * x;
		}
	}

	public static void main(String[] args) {
		System.out.println(powerOf(5, 8));
		

	}

}
