package recursion;

public class PrintNums {
	static void printNums(int n) {
		if (n < 1) {
			return;
		}

		System.out.println(n);
		printNums(n - 1);

	}

	public static void main(String[] args) {
		int n = 5;
		printNums(n);

	}

}
