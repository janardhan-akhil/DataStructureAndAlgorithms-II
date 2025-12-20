package interviewPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
	static int reverse(int x) {
		long rev = 0;

		while (x != 0) {
			int digit = x % 10;
			x = x / 10;
			rev = rev * 10 + digit;
			if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
				return 0;
			}
		}

		return (int) rev;
	}

	static int countDigits(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			int x = n % 10;
			n = n / 10;

		}
		return count;
	}

	static int digitsSum(int n) {
		int sum = 0;
		while (n != 0) {
			int x = n % 10;
			sum = sum + x;
			n = n / 10;

		}
		return sum;
	}

	static List<Integer> lenghtOfEachWord(List<String> li) {
		List<Integer> collect = li.stream().map(String::length).collect(Collectors.toList());
		return collect;
	}

	static List<String> stringsGreaterThan4(List<String> li) {
		return li.stream().filter(s -> s.length() > 4).collect(Collectors.toList());
	}

	static Optional<Integer> secondLargestNumber(int[] arr) {
		// return
		// li.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
		List<Integer> list = new ArrayList<>();
		for (int n : arr) {
			list.add(n);
		}
		return list.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst();
	}

	static Optional<Integer> largestNumber(List<Integer> li) {
		return li.stream().max(Integer::compareTo);
	}

	static void evenOrOdd(List<Integer> li) {
		Map<Boolean, List<Integer>> map = li.stream().collect(Collectors.partitioningBy(n -> n % 2 == 0));
		for (Map.Entry<Boolean, List<Integer>> entry : map.entrySet()) {
			if (entry.getKey() == true) {
				System.out.println("Even Numbers" + entry.getValue());
			} else {
				System.out.println("Odd Numbers" + entry.getValue());
			}
		}
	}

	static void frequencyOfEachChar(String s) {
		Map<Character, Integer> map = new HashMap<>();
		char[] c = s.toCharArray();
		for (char ch : c) {
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}

	static String reverseStringInPlace(String s) {
		char[] ch = s.toCharArray();
		int i = 0, j = ch.length - 1;
		while (i < j) {
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;

			i++;
			j--;
		}
		return new String(ch);
	}

	static void sortListInReverseOrder(List<String> li) {
		Collections.reverse(li);
		System.out.println(li);
	}

	static List<Integer> multipleOf5(List<Integer> li) {
		return li.stream().filter(n -> n % 5 == 0).collect(Collectors.toList());
	}

	static void mergeTwoUnSortedArrays(int[] arr1, int[] arr2) {
		IntStream.concat(Arrays.stream(arr1), Arrays.stream(arr2)).distinct().sorted().forEach(System.out::print);
	}

	static void mergeTwoUnSortedArrays1(int[] arr1, int[] arr2) {
		int[] res = new int[arr1.length + arr2.length];
		int k = 0;
		for (int i = 0; i < arr1.length; i++) {
			res[k++] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			res[k++] = arr2[i];
		}
		Arrays.sort(res);
		for (int l = 0; l < res.length; l++) {
			System.out.print(res[l] + " ");
		}
	}

	static void threeMaxAndThreeMin(List<Integer> li) {
		li.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::print);
		;
		System.out.println();
		li.stream().sorted().limit(3).forEach(System.out::print);
		;
	}

	static Map<Integer, List<String>> listStringsByIncreasingLength(List<String> li) {
		return li.stream().collect(Collectors.groupingBy(String::length));
	}

	static void sumAndAverage(int[] arr) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
			count++;
		}
		System.out.println("sum: " + sum);
		System.out.println("average: " + sum / count);
	}

	static int[] reverseArray(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		return arr;
	}

	static int longestSubStringWithoutRepeatingChars(String s) {
		Set<Character> set = new HashSet<>();
		int maxLen = 0;
		int j = 0;
		for (int i = 0; i < s.length(); i++) {
			while (set.contains(s.charAt(i))) {
				set.remove(s.charAt(j));
				j++;
			}
			set.add(s.charAt(i));
			maxLen = Math.max(maxLen, i - j + 1);
		}
		return maxLen;
	}

	static String reverseWordsInString(String s) {
		String[] ch = s.split(" ");
		String[] res = new String[ch.length];
		int j = 0;
		for (int i = ch.length - 1; i >= 0; i--) {
//			System.out.print(ch[i]+" ");
			res[j++] = ch[i];
		}
		return Arrays.toString(res);
	}

	static String moveHashesToFront(String s) {
		char[] ch = s.toCharArray();
		int j = ch.length-1;
		for (int i = ch.length-1; i >=0; i--) {
			if (ch[i] != '#') {
				ch[j--] = ch[i];
			}
		}
		while(j>=0) {
			ch[j--] = '#';
		}
		
		return new String(ch);
	}
	
	static String moveHashesToEnd(String s) {
		char[] ch = s.toCharArray();
		int j = 0;
		for(int i=0;i<ch.length;i++) {
			if(ch[i] != '#') {
				ch[j++] = ch[i];
			}
		}
		while(j<ch.length) {
			ch[j++] = '#';
		}
		return new String(ch);
	}
	
	static char firstNonRepeatingChar(String s) {
		Map<Character,Integer> map = new LinkedHashMap<>();
		for(char c : s.toCharArray()) {
			map.put(c, map.getOrDefault(c,0)+1);
		}
		
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue() == 1) {
				return entry.getKey();
			}
		}
		return '0';
	}
	
	static int findMissingNumbet(int[] arr) {
		Arrays.sort(arr);
		for(int j=1;j<arr.length;j++) {
			if(arr[j] - arr[j-1] >1) {
				return arr[j-1]+1;
			}
		}
		return -1;
	}
	
	static String evenOrOdd(int n) {
		while(n>0) {
			n = n-2;
		}
		return n==0?"Even":"Odd";
	}
	static int reverseNumber(int n){
		int rev = 0;
		while(n!=0){
			int x = n%10;
			rev = (rev+x)*10;
			n = n/10;
		}
		return rev/10;

	}

	static void printFirstCharOfEachWord(String s) {
		for(int i=0;i<s.length();i++) {
			if(i==0 || s.charAt(i-1)==' ') {
				System.out.print(s.charAt(i)+" ");
			}
		}
	}

	public static void main(String[] args) {
		int x = 25525241;
		List<String> li = List.of("Arun", "Ravi", "Vikram", "Akhil", "Surya");
		int[] arr1 = { 2, 3, 7, 8, 6, 1, 5 };
		int[] arr2 = { 9, 4, 5, 6, 8, 10, 7 };
		List<Integer> li1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
		String s = "swiss";
		List<String> li2 = Arrays.asList("Arun", "Ravi", "Vikram", "Akhil", "Surya");
		String s1 = "I am a Professional cricketer";
		String s2 = "a#b#c#d";
		int[] arr = {1,2,3,4,5,7,8,9,10,11,12};
		int n = 1958;
//		System.out.println(reverse(x));
//		System.out.println(countDigits(x));
//		System.out.println(digitsSum(x));

//		System.out.println(lenghtOfEachWord(li));
//		System.out.println(stringsGreaterThan4(li));
//		System.out.println(secondLargestNumber(arr));
//		System.out.println(largestNumber(li1));
//		evenOrOdd(li1);
//		frequencyOfEachChar(s);
//		System.out.println(reverseStringInPlace(s));
//		sortListInReverseOrder(li2);
//		System.out.println(multipleOf5(li1));
//		mergeTwoUnSortedArrays(arr1, arr2);
//		mergeTwoUnSortedArrays1(arr1, arr2);
//		threeMaxAndThreeMin(li1);
//		System.out.println(listStringsByIncreasingLength(li2));
//		sumAndAverage(arr2);
//		int[] res = reverseArray(arr2);
//		for (int i = 0; i < res.length; i++) {
//			System.out.print(res[i]+" ");
//		}
//		System.out.println(longestSubStringWithoutRepeatingChars(s));
//		System.out.println(reverseWordsInString(s1));
//		System.out.println(moveHashesToFront(s2));
//		System.out.println(moveHashesToEnd(s2));
//		System.out.println(firstNonRepeatingChar(s));
//		System.out.println(findMissingNumbet(arr));
//		System.out.println(evenOrOdd(n));
//
//		String string = Stream.of(s.split("")).reduce("",(a,b) -> b+a);
//		System.out.println(string);
//		System.out.println(reverseNumber(x));

		printFirstCharOfEachWord(s1);
	}

}
