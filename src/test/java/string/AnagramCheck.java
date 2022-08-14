package string;

import java.util.Arrays;

public class AnagramCheck {
	
	/*
	 * anagram means 2 strings contains same set of characters but in different
	 * order
	 */

	public static void main(String[] args) {
	
		System.out.println(AnagramCheck.anagramCheck1());
	}
	
	
	public static boolean anagramCheck1() {
		String s1="java";
		String s2="vaja";
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		Arrays.sort(ch1);
		//System.out.print(Arrays.sort(ch1));
		Arrays.sort(ch2);
		if(Arrays.equals(ch1, ch2))
		{
			return true;
		}
		
		return false;
		
		
		
		
	}
}
