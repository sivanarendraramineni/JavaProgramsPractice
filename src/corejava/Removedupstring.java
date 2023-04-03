package corejava;

import java.util.HashSet;

public class Removedupstring {
	
	public static void main(String[] args) {
		
		String str="automation";
		char str1[]=str.toCharArray();
 
       HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<str1.length-1;i++)
		{
			hs.add(str1[i]);
		}
		System.out.println(hs);
	}

}
