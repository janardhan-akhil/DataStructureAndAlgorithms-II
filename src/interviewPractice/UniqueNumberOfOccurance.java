package interviewPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurance {
	static boolean uniqueNoOfOccuranceII(int[] arr) {
		
		//return true if the number of occurrences of each value in the array is unique or false otherwise.
		Map<Integer,Integer> map = new HashMap<>();
		Set<Integer> set = new HashSet<>();
		for( int n:arr) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		if(map.size() ==1) {
			return true;
		}
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			set.add(entry.getValue());
		}
		if(set.size() != map.size()) {
			return false;
		}else {
			return true;
		}
		
		
	}

	public static void main(String[] args) {
		int[] arr = {1,2,2,1,1,3};
		System.out.println(uniqueNoOfOccuranceII(arr));
	}

}
