package interviewPractice;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
	static int singleNumber(int[] arr) {
		Map<Integer,Integer> map= new HashMap<>();
		for(int n : arr) {
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() == 1) {
				return entrySet.getKey();			}
		}
		return 0;
	}
	static int singleNumber1(int[] arr) {
		int res = 0;
		for(int i = 0;i<arr.length;i++) {
			res = res^arr[i];
		}
		return res;
	}

	public static void main(String[] args) {
		System.out.println(singleNumber(new int[] {2,2,1,1,5}));
		System.out.println(singleNumber1(new int[] {4,2,1,2,4,5,5}));

	}

}
