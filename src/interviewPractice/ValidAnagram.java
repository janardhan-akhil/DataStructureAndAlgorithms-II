package interviewPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
	static boolean validAnagram(String s1, String s2) {
		if(s1.length() != s2.length()) {
			return false;
		}
		char[] ch1 = s1.toCharArray();
		char[] ch2 = s2.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		String st1 = new String(ch1);
		String st2 = new String(ch2);
		
		return st1.equals(st2);
	}
	
	static boolean validAnagram2(String s1, String s2) {
		
		Map<Character,Integer> map = new HashMap<>();
		for(char ch1:s1.toCharArray()) {
			map.put(ch1, map.getOrDefault(ch1, 0)+1);
		}
		for(char c : s2.toCharArray()) {
			if(!map.containsKey(c)) {
				return false;
			}
			map.put(c, map.get(c) - 1);
		    if (map.get(c) < 0) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		String s1 = "ab";
		String s2 = "a";
		//System.out.println(validAnagram(s1, s2));
		System.out.println(validAnagram2(s1, s2));
		

	}

}
