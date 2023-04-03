package corejava;

import java.util.HashMap;

public class Countofcharsinstr {

	public static void main(String[] args) {
		
	String str="automation";
	HashMap<Character,Integer> charc=new HashMap<Character,Integer>();
	
	for(int i=str.length()-1;i>=0;i--)
	{
		
		if(charc.containsKey(str.charAt(i))) {
			
			int count=charc.get(str.charAt(i));
			charc.put(str.charAt(i), ++count);
		}
		else
		{
			charc.put(str.charAt(i), 1);
		}
	}
	System.out.println(charc);
	}

}
