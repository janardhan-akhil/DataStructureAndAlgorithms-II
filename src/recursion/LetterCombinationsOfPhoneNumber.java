package recursion;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsOfPhoneNumber {
	static String[] keypad = {" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
	static List<String> li = new ArrayList<>();
	static List<String> letterCombinations(String s, String ans) {
		if(s.length() == 0) {
			li.add(ans);
			return li;
		}
		String key = keypad[s.charAt(0) - 48];
		
		for(int i=0;i<key.length();i++) {
			letterCombinations(s.substring(1), ans+key.charAt(i));
		}
		return li;
		
		
	}

	public static void main(String[] args) {
		String s = "84";
		System.out.println(letterCombinations(s, ""));
		//System.out.println(li);
	}

}
