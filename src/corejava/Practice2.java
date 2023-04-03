package corejava;

import java.util.HashSet;
import java.util.LinkedHashMap;

public class Practice2 {

	public static void main(String[] args) {
	
		String str1="race";
		String str2="care";

		int n=str1.length();
		char[] arr1=str1.toCharArray();
		char[] arr2=str2.toCharArray();
		int count=0;
		for(int i=0;i<arr1.length;i++)
		{
		  for(int j=0;j<arr2.length;j++)
		   
		   if(arr1[i]==arr2[j])
		      count++;
		     
		}
		  if(count==n)
		{
		  System.out.println("the given strings are hanograms");
		}
		else
		{
		System.out.println("the given strings are  not hanograms");
		}

	}

}
