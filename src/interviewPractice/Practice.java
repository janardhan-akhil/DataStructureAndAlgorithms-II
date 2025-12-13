package interviewPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Practice {

	static String addString(String s) {
		String res = "";
		int count = 1;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				res = res + s.charAt(i - 1) + count;
				count = 1;
			}
		}
		res = res + s.charAt(s.length() - 1) + count;
		return res;
	}

	static String splitString(String s) {
		Set<Character> lowerChSet = new TreeSet<>();
		Set<Character> upperChSet = new TreeSet<>();
		for (char ch : s.toCharArray()) {
			if (Character.isLowerCase(ch)) {
				lowerChSet.add(ch);
			} else {
				upperChSet.add(ch);
			}
		}

		StringBuilder lowSb = new StringBuilder();
		StringBuilder upSb = new StringBuilder();
		for (char c : lowerChSet) {
			lowSb.append(c);
		}
		for (char c : upperChSet) {
			upSb.append(c);
		}

		return "\"" + lowSb.toString() + "\",\"" + upSb.toString() + "\"";
	}

	static void removeDuplicatesInPlace(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		for (int i = 0; i <= j; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void printFirstCharInEveryWord(String s) {
		if (s.charAt(0) != ' ') {
			System.out.print(s.charAt(0));
		}
		for (int i = s.length() - 1; i > 0; i--) {

			if (s.charAt(i) != ' ' && s.charAt(i - 1) == ' ') {
				System.out.print(s.charAt(i));
			}
		}
	}
	
	static int countWordsInString(String s) {
		int count = 0;
		Map<String, Integer> map = new HashMap<>();
		String[] str = s.split(" ");
		
		for(String st : str) {
			map.put(st, map.getOrDefault(st, 0)+1);
			count++;
		}
		
		return count;
	}
	
	static void duplicateCharsInString(String s) {
		Map<Character,Integer> map = new HashMap<>();
		char[] ch = s.toCharArray();
		for(char c : ch) {
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ "->"+entry.getValue());
			}
		}
	}

	public static void main(String[] args) {
		String s = "aabbbcccdd";
		String s1 = "aBACbcEDed";
		String word = "Sky Is Blue Hello World";
		int[] arr = { -3, -3, -2, -1, -1, 0, 0, 1 };
		// System.out.println(addString(s));
		// System.out.println(splitString(s1));
		//removeDuplicatesInPlace(arr);
		//printFirstCharInEveryWord(word);
		//System.out.println(countWordsInString(word));
		duplicateCharsInString(s);

	}

}
