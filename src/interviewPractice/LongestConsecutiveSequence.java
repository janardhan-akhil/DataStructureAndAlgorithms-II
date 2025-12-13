package interviewPractice;


import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
	static int longestConsecutiveSequence(int[] arr) {
		int max = 0;
		Set<Integer> set = new HashSet<>();
		
		for(int n : arr) {
			set.add(n);
		}
		
		for(int num : set) {
			if(!set.contains(num-1)) {
				int curNum = num;
				int len = 1;
				
				while(set.contains(curNum +1)) {
					curNum++;
					len++;
				}
				
				max = Math.max(max, len);
			}
			
			
		}
		return max;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,3,50,51,52,53};
		System.out.println(longestConsecutiveSequence(arr));

	}

}
