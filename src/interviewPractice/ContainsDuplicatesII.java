package interviewPractice;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicatesII {
	static boolean containsDuplicates(int[] arr, int k) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					if((j-i)==k) {
						return true;
					}
				}
			}
		}
		return false;
	}
	
	static boolean containsDuplicatesII(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(arr[i])) {
				return true;
			}
			set.add(arr[i]);
			
			if(set.size()>k) {
				set.remove(arr[i-k]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,1,2,3};
		int k = 2;
		System.out.println(containsDuplicates(arr, k));
		System.out.println(containsDuplicatesII(arr, k));
		
		

	}

}
