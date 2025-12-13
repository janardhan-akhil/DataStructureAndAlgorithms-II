package interviewPractice;

import java.util.ArrayList;
import java.util.List;

public class GreatestNoOfCandies {
	
	static List<Boolean> greatestNoOfCandies(int[] candies, int extraCandies){
		
		List<Boolean> list = new ArrayList<>();
		
		int max = Integer.MIN_VALUE;
		for(int i = 0;i<candies.length;i++) {
			if(candies[i] > max) {
				max = candies[i];
			}
		}
		for(int i =0;i<candies.length;i++) {
			list.add(candies[i]+extraCandies >= max);
		}
		
		return list;
	}

	public static void main(String[] args) {
		int[] candies = {4,2,1,1,2};
		int extraCandies = 1;
		System.out.println(greatestNoOfCandies(candies, extraCandies));

	}

}
