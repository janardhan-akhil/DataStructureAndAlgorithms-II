package recursion;

public class FirstNNaturalNums {
	static void printNaturalNums(int n) {
		if(n == 0) {
			return;
		}
		printNaturalNums(n-1);
		System.out.println(n);
		
	}

	public static void main(String[] args) {
	printNaturalNums(5);

	}

}
