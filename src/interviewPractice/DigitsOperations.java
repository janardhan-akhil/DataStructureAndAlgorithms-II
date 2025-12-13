package interviewPractice;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DigitsOperations {
	static String countChars(String s) {
		int count = 1;
		String res = "";
		for(int i=1;i<s.length();i++) {
			if(s.charAt(i) == s.charAt(i-1)) {
				count++;
			}else {
				res = res+s.charAt(i-1)+count;
				count = 1;
			}
		}
		res = res+s.charAt(s.length()-1)+count;
		return res;
	}
	
	static int countDigits(int n) {
		int digits = 0;
		while(n > 0) {
			n = n/10;
			digits++;
		}
		return digits;
	}
	
	static int sumOfDigits(int n) {
		int sum = 0;
		while(n>0) {
			int x = n%10;
			sum = sum+x;
			n = n/10;
		}
		return sum;
	}
	
	static int reverseNumber(int n) {
		int rev = 0;
		while(n>0) {
			int x = n%10;
			rev = (rev*10)+x;
			n = n/10;
		}
		return rev;
	}
	
	static String splitString(String s1) {
		Set<Character> lowerSet = new TreeSet<>();
		Set<Character> upperSet = new TreeSet<>();
		for(char ch : s1.toCharArray()) {
			if(Character.isLowerCase(ch)) {
				lowerSet.add(ch);
			}else {
				upperSet.add(ch);
			}
		}
		
		StringBuilder lowerSb = new StringBuilder();
		StringBuilder upperSb = new StringBuilder();
		
		for(char ch1 : lowerSet) {
			lowerSb.append(ch1);
		}
		for(char ch2 : upperSet) {
			upperSb.append(ch2);
		}
		
		return "\""+lowerSb.toString()+","+upperSb.toString()+"\"";
	}
	
	static int sumOfDistinctElements(int[] arr) {
		int sum = 0;
		int j = 0;
		for(int i = 1;i<arr.length;i++) {
			if(arr[i] != arr[j]) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		for(int i = j+1;i<arr.length;i++) {
			sum = sum+arr[i];
		}
		return sum;
	}
	static char firstNonRepeatingChar(String s) {
		Map<Character, Integer> map = new LinkedHashMap<>();
		for(char ch : s.toCharArray()) {
			map.put(ch, map.getOrDefault(ch, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() == 1) {
				 return entrySet.getKey();
			}
		}
		return '0';
		
	}
	static void printMonths() {
		
			System.out.println(LocalDate.now().getMonth());
			Month curMonth = LocalDate.now().getMonth();
			Month[] months = Month.values();
			
			boolean print = false;
			for(int i=0;i<months.length;i++) {
				if(print) {
					System.out.println(months[i]);
				}
				if(months[i]== curMonth) {
					print = true;
				}
			}
	}
	
	static int[] moveZerosToEnd(int[] arr) {
		int j=0;
		int[] res = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				res[j++] = arr[i];
			}
		}
		while(j<arr.length) {
			res[j++] = 0;
		}
		return res;
	}
	
	static void printSquaresOfEachElement(int[] arr) {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]*arr[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		//System.out.println(countChars("aaabbcccddd"));
		//System.out.println(countDigits(254789));
		//System.out.println(sumOfDigits(12345));
		//System.out.println(reverseNumber(12345));
		//System.out.println(splitString("aBACbcEDed"));
		//System.out.println(sumOfDistinctElements(new int[]{1,1,1,2,2,3,4,4,5,5}));
		//System.out.println(firstNonRepeatingChar("aabbccddee"));
		//printMonths();
//		int[] res = moveZerosToEnd(new int[]{2,0,2,5,0,0,0,3,0,4,0,1,0,5,0});
//		for(int i=0;i<res.length;i++) {
//			System.out.print(res[i]+" ");
//		}
		printSquaresOfEachElement(new int[] {2,5,8,9,6,1,4,7});
		
		
		

	}

}
