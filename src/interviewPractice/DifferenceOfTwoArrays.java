package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DifferenceOfTwoArrays {
	static List<List<Integer>> differenceOfTwoArrays(int[] arr1, int[] arr2){
		
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		for (int num : arr1) set1.add(num);
        for (int num : arr2) set2.add(num);
		
        set1.removeAll(set2);
        for (int num : arr1) set2.remove(num);
       
       
        return Arrays.asList(
                new ArrayList<>(set1),
                new ArrayList<>(set2)
            );
	}

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,4,6};
		
		System.out.println(differenceOfTwoArrays(arr1, arr2));

	}

}
