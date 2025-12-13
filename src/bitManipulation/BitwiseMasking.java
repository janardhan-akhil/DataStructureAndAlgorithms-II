package bitManipulation;

public class BitwiseMasking {
	
	static int onMask(int n){
		int i = 2;
		int on = 1<<i;
		return (n | on);
	}
	static int offMask(int n){
		int i = 3;
		int off = ~(1<<i);
		return (n & off);
	}
	static int toggle(int n) {
		int i = 4;
		int mask = 1<<i;
		return (n ^ mask);
	}
	static void onOrOff(int n) {
		int i = 3;
		int cmask = 1<<i;
		if((n & cmask) == 0) {
			System.out.println("OFF");
		}else {
			System.out.println("ON");
		}
	}

	public static void main(String[] args) {
		int n = 26;
		System.out.println(onMask(n));
		System.out.println(offMask(n));
		System.out.println(toggle(n));
		onOrOff(n);
	
		

	}

}
