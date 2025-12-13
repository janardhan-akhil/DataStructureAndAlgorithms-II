package interviewPractice;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class MissingNumbers {

	static void missingNumbers(int[] arr) {
		Arrays.sort(arr);
		for(int j=1;j<arr.length;j++) {
			if(arr[j] - arr[j-1] >1) {
				System.out.println(arr[j-1]+1);
			}
		}
	}
	
	static int missingNumbers1(int[] arr) {
		int n = arr.length;
        int missing = n;
        for (int i = 0; i < n; i++) {
            missing ^= i ^ arr[i];
        }
        return missing;
		
	}
	public static void main(String[] args) {
		int[] arr = {2,5,1,4,3,7,0,8};
		missingNumbers(arr);
		System.out.println(missingNumbers1(arr));
		

	}

}
