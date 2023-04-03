package corejava;

import java.util.HashSet;
import java.util.Set;

public class Commonelearray {

	public static void main(String[] args) {

		String str1[]= {"siva","narendra","ramineni","siva"};
		String str2[]= {"siva","narendra","ramineni","priyanka","pragnya"};
		
		HashSet<String> hs= new HashSet<String>();
		for(int i=0;i<str1.length;i++)
		{
			for(int j=0;j<str2.length;j++)
			{
				if(str1[i]==str2[j])
				{
					hs.add(str1[i]);
				}
			}
		}
		System.out.println(hs);
	}

}
