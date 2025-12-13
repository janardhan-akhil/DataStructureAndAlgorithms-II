package recursion;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceOfString {
	static List<String> li = new ArrayList<>();
	static void subSequence(String s,String ans){
		
		if(s.length()==0) {
			li.add(ans);
			//System.out.println(ans);
			return;
		}
		subSequence(s.substring(1), ans+s.charAt(0));
		subSequence(s.substring(1), ans);
		
	}

	public static void main(String[] args) {
		String s = "abc";
		subSequence(s, "");
		System.out.println(li);

	}

}
