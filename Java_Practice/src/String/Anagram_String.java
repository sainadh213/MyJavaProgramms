package String;

import java.util.Arrays;

public class Anagram_String {
	/* Anagram: Two strings are said to be anagrams if they make a meaningful word by
    rearranging or shuffling the letters of the string  */

	public static void main(String[] args) {
		String s="sainadh213";
		String s2="nhdsi2a3a1";
		char[] s3=s.toCharArray();
		char[] s4=s2.toCharArray();
		
		Arrays.sort(s3);
		Arrays.sort(s4);
		System.out.println(s3);
		System.out.println(s4);
		
		if(Arrays.equals(s3,s4))
		{
			System.out.println("Given String is Anagram");
		}
		else
		{
			System.out.println("Given String is Not Anagram");
		}
		
	}
	}

