package bitManipulation;

import java.util.HashSet;
import java.util.Set;

public class LonelyInteger {
	static int lonelyInteger(int[] arr) {
		for(int i = 0;i<arr.length-2;i+=2) {
			if(arr[i]!=arr[i+1]) {
				return arr[i];
			}
		}
		return arr[arr.length-1];
	}
	static int lonelyIntegerI(int[] arr) {
		Set<Integer> set = new HashSet<>();
		for(int n : arr) {
			if(set.contains(n)) {
				set.remove(n);
			}else {
				set.add(n);
			}
		}
		
		for(int i : set) {
			return i;
		}
		return -1;
	}
	
	static int lonelyIntegerII(int[] arr) {
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			res = res ^ arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = {1,1,2,2,3,4,4,5,5};
		System.out.println(lonelyInteger(arr));
		System.out.println(lonelyIntegerI(arr));
		System.out.println(lonelyIntegerII(arr));
		

	}

}
