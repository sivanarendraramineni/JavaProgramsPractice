package corejava;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="race";
		String str2="care";
		
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		
		if(str1.length()==str1.length())
 
		{
			
			char[] chararr1=str1.toCharArray();
			char[] chararr2=str2.toCharArray();
			
			Arrays.sort(chararr1);
			Arrays.sort(chararr2);
			
			boolean result=Arrays.equals(chararr1, chararr2);
			
			if(result==true)
			{
				System.out.println("Strings are anagrams");
			}
			else {
				System.out.println("Strings are not anagrams");
			}
			
			
		}
		else {
			System.out.println("Strings are not anagrams");
		}
	}

}
